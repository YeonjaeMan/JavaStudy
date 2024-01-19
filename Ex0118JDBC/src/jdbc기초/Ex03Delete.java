package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {
		// 회원 탈퇴
		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게서 id, pw 입력
		System.out.println("==== 회원탈퇴 ====");
		System.out.print("id 입력 : ");
		String id = sc.next();
		System.out.print("pw 입력 : ");
		String pw = sc.next();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if(conn != null) {
				System.out.println("DB 연결 성공");
			} else {
				System.out.println("DB 연결 실패");
			}
			
			String sql = "DELETE FROM jdbctest.bigdatamember WHERE id = ? AND pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			int row = psmt.executeUpdate();

			// 2. 회원탈퇴에 성공 => 회원탈퇴 성공
			// 회원탈퇴에 실패 => 회원탈퇴 실패
			if (row > 0) {
				System.out.println("회원탈퇴 성공");
			} else {
				System.out.println("회원탈퇴 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(psmt != null)
						psmt.close();
					if(conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}

	}

}
