package quiz;

public class MemberDto {
	private int memberNum;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String phoneNum;
	public MemberDto(int memberNum, String id, String pw, String name, String email, String phoneNum) {
		super();
		this.memberNum = memberNum;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	public MemberDto() {
		
	}
	
	
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getPW() {
		return pw;
	}
	public void setPW(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	@Override
	public String toString() {
		return "MemberDto [MemberNum=" + memberNum + ", id=" + id + ", pw=" + pw + ", Name="
				+ name + ", Email=" + email + ", phoneNum=" + phoneNum + "]";
	}
}
