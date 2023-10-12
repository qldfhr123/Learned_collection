package session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private Connection con;
	
	public MemberDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String password = "oracle";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public MemberDTO selectId(String id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("SELECT * FROM session_exam WHERE id=?");
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				MemberDTO memberDto = new MemberDTO();
				memberDto.setId(rs.getString("id"));
				memberDto.setPw(rs.getString("pw"));
				memberDto.setName(rs.getString("name"));
				memberDto.setEmail(rs.getString("email"));
				return memberDto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void register(String id, String pw, String name, String email) {
		String sql = "INSERT INTO session_exam VALUES(?,?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, email);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(String id, String pw, String name, String email) {
		String sql = "UPDATE session_exam SET pw=?, name=?, email=? WHERE id=?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(4, id);
			ps.setString(1, pw);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(String id) {
		String sql = "DELETE FROM session_exam WHERE id=?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void disConnection() {
		try {
			if(con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int count(String select, String search) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql ="";
	
		int count = 0;
		try {
			if(select.isEmpty()) {
				sql ="SELECT count(id) FROM session_exam ";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
			}else if(select.equals("id")) {
				sql ="SELECT count(id) FROM session_exam WHERE id like ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, "%"+search+"%");                        
				rs = ps.executeQuery();
			}else {
				sql ="SELECT count(id) FROM session_exam WHERE email like ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, "%"+search+"%");
				rs = ps.executeQuery();
			}
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	public ArrayList<MemberDTO> selectAll(int begin, int end, String select, String search) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<MemberDTO> members = new ArrayList<MemberDTO>();
		String sql = "";

		try {
			//조건문을 여러개 하는 이유는 sql 문장의 칼럼값을 ?로 지정할수없기때문에 상황에 맞게 데이터를 가져오기위해서
			if(select.isEmpty()) {
				sql ="SELECT AAA.* "
					+ "FROM (SELECT rownum as rn, id, pw, name, email FROM session_exam)AAA "
					+ "WHERE AAA.rn <= ? AND AAA.rn >= ?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, end);
				ps.setInt(2, begin);
			}
			else if(select.equals("id")) {
				sql ="SELECT AAA.* "
					+ "FROM (SELECT rownum as rn, id, pw, name, email FROM session_exam WHERE id like ?)AAA "
					+ "WHERE AAA.rn <= ? AND AAA.rn >= ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, "%"+search+"%");//데이터 값을 '~~' 이렇게 표현하기위해 앞에 "%" 붙힌다
				ps.setInt(2, end);
				ps.setInt(3, begin);
			}
			else {
				sql ="SELECT AAA.* "
					+ "FROM (SELECT rownum as rn, id, pw, name, email FROM session_exam WHERE email like ?)AAA "
					+ "WHERE AAA.rn <= ? AND AAA.rn >= ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, "%"+search+"%");
				ps.setInt(2, end);
				ps.setInt(3, begin);
			}
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO memberDto = new MemberDTO();
				memberDto.setId(rs.getString("id"));
				memberDto.setPw(rs.getString("pw"));
				memberDto.setName(rs.getString("name"));
				memberDto.setEmail(rs.getString("email"));
				members.add(memberDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return members;
	}
}
