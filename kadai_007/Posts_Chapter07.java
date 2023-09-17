package text.kadai_007;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Posts_Chapter07 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement statement = null;
		
		//投稿リスト
		String[][] postList = {
				{"1003","2023-02-08","昨日の夜は徹夜でした．．","13"},
				{"1002","2023-02-08","お疲れ様です！","12"},
				{"1003","2023-02-09","今日も頑張ります","18"},
				{"1001","2023-02-09","無理は禁物ですよ！","17"},
				{"1002","2023-02-10","明日から連休ですね！","20"}
		};

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/challenge_java",
	                "root",
	                "***"
	        );
			System.out.println("データベース接続成功:"+con);
			
			// SQLクエリを準備（追加処理）
            String insertSql = "INSERT INTO posts (user_id, posted_at,post_content,likes) VALUES (?, ?, ?, ?);";
            statement = con.prepareStatement(insertSql);
            System.out.println("レコード追加を実行します");
            
            int rowCnt = 0;
            for( int i = 0; i < postList.length; i++ ) {
                // SQLクエリの「?」部分をリストのデータに置き換え
                statement.setInt(1, Integer.parseInt(postList[i][0])); // user_id
                statement.setString(2, postList[i][1]); // posted_at
                statement.setString(3, postList[i][2]); // post_content
                statement.setInt(4, Integer.parseInt(postList[i][3])); // likes

                // SQLクエリを実行（DBMSに送信）
                rowCnt += statement.executeUpdate();
            }
            System.out.println( rowCnt + "件のレコードが追加されました");
            
         // SQLクエリを準備（検索処理）
            String whereSql = "SELECT * FROM posts WHERE user_id = ?;";
            //検索したいユーザid
            int searchUserId = 1002;
            statement = con.prepareStatement(whereSql);
            statement.setInt(1, searchUserId);
            
         //　SQLクエリを実行（DBMSに送信）
            ResultSet result = statement.executeQuery();
            
            System.out.println("ユーザIDが"+searchUserId+"のレコードを検索しました");
            
         // SQLクエリの実行結果を抽出
            while(result.next()) {
                Date posted_at = result.getDate("posted_at");
                String post_content = result.getString("post_content");
                int likes = result.getInt("likes");
                System.out.println(result.getRow() + "件目："
                                   + "投稿日時=" + posted_at + "／投稿内容=" + post_content  + "／いいね数=" + likes);
            }
            
        } catch(SQLException e) {
            System.out.println("エラー発生：" + e.getMessage());
        } finally {
            // 使用したオブジェクトを解放
            if( statement != null ) {
                try { statement.close(); } catch(SQLException ignore) {}
            }
            if( con != null ) {
                try { con.close(); } catch(SQLException ignore) {}
            }
        }
	}

}
