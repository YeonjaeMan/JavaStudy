package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04selectAll {

	public static void main(String[] args) {


		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

//			if (conn != null) {
//				System.out.println("DB 연결 성공");
//			} else {
//				System.out.println("DB 연결 실패");
//			}

			String sql = "SELECT * FROM jdbctest.bigdatamember";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			System.out.println("======= 전체 회원 조회 =======");
			System.out.println("ID\t이름\t나이\t점수");
			
			if (rs != null) {
				while (rs.next()) {
					System.out.println(rs.getString("id") + "\t" + rs.getString("b_name") + "\t" + rs.getInt("age")
							+ "\t" + rs.getInt("score"));
				}
			} else {
				System.out.println("회원 조회 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
