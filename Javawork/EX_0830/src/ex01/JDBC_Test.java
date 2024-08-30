package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Test {
	public static void main(String[] args) {
		
		// oracle 데이터베이스와 java 어플리케이션 간의 연결을 제공하는
		// JDBC드라이버의 클래스 OracleDriver는 데이터 베이스와 상호작용하고
		// 데이터 베이스 연결 및 쿼리 실행을 처리하는 Java 어플리케이션에 사용된다.
		//Oracle 데이터 베이스와 통신을 담당하며, Java코드가 Oracle데이터베이스와 상호작용할 수 있게 해준다.
		String driver = "oracle.jdbc.driver.OracleDriver";
		// JDBC 드라이버는 THIN방식과 OCI방식이 있다.
		// thin : 순수하게 자바 패키지만(class)으로 바로 db와 연결, 범용성이 높음
		// oci : oracle call interface 특정 운영체제 내에서만 돌아가는 모듈을 통해 db에 연결한다.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userId = "hr";
		String password = "hr";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<Dept> list = new ArrayList<>();
		
		try {
			Class.forName(driver);
			//url,아이디, 비번을 가지고 db연결
			con = DriverManager.getConnection(url,userId,password);
			// 문자열로 된 쿼리
			String sql = "SELECT * FROM DEPT2";
			//문자열을 전달받아 실제 쿼리 문으로 변경
			pstmt = con.prepareStatement(sql);
			//쿼리문 실행 후 rs객체에 저장
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Dept d = new Dept();
				d.setDeptno(rs.getInt("deptno"));
				d.setDname(rs.getString("dname"));
				d.setLoc(rs.getString("loc"));
				list.add(d);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		for(Dept d : list) {
			System.out.println(d.getDeptno() + "\t" + d.getDname() + "\t" +d.getLoc());	
		}
		int res = insertDept2(60,"개발부","606");
		if(res == 1) {
			System.out.println("잘 추가됌");
		}
	}
	
	static int insertDept2(int deptno, String dname, String loc) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userId = "hr";
		String password = "hr";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<Dept> list = null;
		int res = 0;
		try {
			Class.forName(driver);
			//url,아이디, 비번을 가지고 db연결
			con = DriverManager.getConnection(url,userId,password);
			// 문자열로 된 쿼리
			String sql = "INSERT INTO DEPT2 VALUES(?,?,?)";
			//문자열을 전달받아 실제 쿼리 문으로 변경
			pstmt = con.prepareStatement(sql);
			
			//각각의 물음표 값을 전달
			pstmt.setInt(1, deptno);
			pstmt.setString(2,dname);
			pstmt.setString(3,loc);
			
			// 바뀐 행 수만큼 정수ㅡ로 반환
			res = pstmt.executeUpdate();			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();			
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return res;
	}
}
