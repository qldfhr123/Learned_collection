package disassemble.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import disassemble.DTO.MemberDTO;
import java.util.Collection;

public class MemberDAO extends MemberDTO {
	
	private Connection con;
	
	public MemberDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "testing";
		String password = "testing";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public int insert(MemberDTO mdto) {	
		int reuslt = 0 ; 
		String sql = "INSERT INTO disassemble VALUES(?,?,?,?)";
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mdto.getEmail());
			ps.setString(2, mdto.getPassword());
			ps.setString(3, mdto.getName());
			ps.setString(4, mdto.getRegisterDate());
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reuslt;
	}

	
	public Collection<MemberDTO>  selectAll() {
		Collection<MemberDTO> members = new ArrayList<>();
		String sql = "SELECT * FROM disassemble";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO mdto = new MemberDTO();
				
				String id = rs.getString("email");
				mdto.setEmail(id);
				
				String password = rs.getString("password");
				mdto.setPassword(password);
				
				String name = rs.getString("name");
				mdto.setName(name);
				
				String registerDate = rs.getString("registerDate");
				mdto.setRegisterDate(registerDate);
				
				members.add(mdto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return members;
	}

	public MemberDTO selectEmail(String email) {
		String sql = "SELECT * FROM disassemble WHERE email=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				MemberDTO check = new MemberDTO();
				check.setEmail(email);
				String password = rs.getString("password");
				check.setPassword(password);
				return check;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public int update(MemberDTO member) {
		String sql = "UPDATE disassemble SET password=? WHERE email=?";
		PreparedStatement ps = null;
		int reuslt = 0 ; 
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getPassword());
			ps.setString(2, member.getEmail());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reuslt;
	}


	public int delete(String email) {
		
			String sql = "DELETE FROM disassemble WHERE email=?";
			PreparedStatement ps = null;
			int reuslt = 0 ; 
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, email);
				reuslt = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return reuslt;
		
		
	}

}









