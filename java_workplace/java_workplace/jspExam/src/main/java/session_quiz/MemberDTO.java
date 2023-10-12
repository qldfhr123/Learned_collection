package session_quiz;
/*
CREATE TABLE session_exam(
id varchar2(20),
pw varchar2(20),
name varchar2(21),
email varchar2(200),
PRIMARY KEY(id)
);
 */
// Data Transfer Object
public class MemberDTO {
	//userName : user_name;
	
	private String id;
	private String pw;
	private String confirm;
	private String user_name;
	private String address;
	private String mobile;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
