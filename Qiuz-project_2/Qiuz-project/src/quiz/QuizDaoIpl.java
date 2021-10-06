package quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class QuizDaoIpl implements QuizDao{
	
	private static QuizDaoIpl instance = new QuizDaoIpl();
	//외부에서 객체를 생성하지 못하도록 막는다.
	private QuizDaoIpl() {}
	//객체를 받아볼 수 있도록 메서드를 제공한다.
	public static QuizDaoIpl getInstance() {
		return instance;

	}
	
	@Override
	public int signUp(int memberNum, String id, String pw, String name, String email, String phoneNum) 
			throws ClassNotFoundException, SQLException{
		String sql = "insert into Member(Member_Number, ID, Password, Name, email, Phone_Number) value(?, ?, ?, ?, ?, ?)";
		try(Connection conn = Dbconn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
			
			pst.setInt(1, memberNum);
			pst.setString(2, id);
			pst.setString(3, pw);
			pst.setString(4, name);
			pst.setString(5, email);
			pst.setString(6, phoneNum);
			
			pst.executeUpdate();	
		}
		return 0;
	}
	
	
	@Override
	public List<MemberDto> search(String id) throws ClassNotFoundException, SQLException{
		String sql = "select * from Member where ID=?";
		try(Connection conn = Dbconn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql);){
			
			pst.setString(1, id);
			

			try(ResultSet rs = pst.executeQuery()){
				List<MemberDto> memberList = new ArrayList<MemberDto>();
				
				while(rs.next()) {
					memberList.add(convertMember(rs));
				}
				return memberList;
			}
		}
	}
	

	@Override
	public List<WordDto> word(int category, int level) throws ClassNotFoundException, SQLException{
		
		String sql = "select * from Word where Category=? and Level = ?";
		
		try(Connection conn = Dbconn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql);){
			
			pst.setInt(1, category);
			pst.setInt(2, level);

			try(ResultSet rs = pst.executeQuery()){
				List<WordDto> wordList = new ArrayList<WordDto>();
				
				while(rs.next()) {
					wordList.add(convertWord(rs));
				}
				return wordList;
			}
		}
	}

	private WordDto convertWord(ResultSet rs) throws ClassNotFoundException, SQLException{
		return new WordDto(rs.getInt("Word_ID"), rs.getInt("Category"), rs.getInt("Level"), 
				rs.getString("Korean"), rs.getString("English"));
	}
	
	@Override
	public int totalScore(RankDto rankDto) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public List<MemberDto> login(String id, String pw) throws ClassNotFoundException, SQLException{
		String sql = "select * from Member where ID=? and Password=?";
		try(Connection conn = Dbconn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql);){
			
			pst.setString(1, id);
			pst.setString(2, pw);
		
			
			try(ResultSet rs = pst.executeQuery()){
				List<MemberDto> memberList = new ArrayList<MemberDto>();
				
				while(rs.next()) {
					memberList.add(convertMember(rs));
				}
				return memberList;
			}
		}
	}
	
	
	private MemberDto convertMember(ResultSet rs) throws ClassNotFoundException, SQLException{
		return new MemberDto(rs.getInt("Member_Number"), rs.getString("ID"), rs.getString("Password"), 
				rs.getString("Name"), rs.getString("email"), rs.getString("Phone_Number"));
	}
	
	
	
	@Override
	public void logout(MemberDto member) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		
	}
	
}
