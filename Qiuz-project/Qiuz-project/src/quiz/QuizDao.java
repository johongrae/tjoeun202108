package quiz;

import java.sql.SQLException;
import java.util.List;

public interface QuizDao {
	//회원가입
	public int signUp(int memberNum, String id, String pw, String name, String email, String phoneNum)
			throws ClassNotFoundException, SQLException;
	
	//문제출제
	public int word(WordDto wordDto) throws ClassNotFoundException, SQLException;
	
	//정답확인
	
	
	//점수합산 -> 랭킹조회
	public int totalScore(RankDto rankDto) throws ClassNotFoundException, SQLException;
	
	//로그인
	public List<MemberDto> login(String id, String pw) throws ClassNotFoundException, SQLException;
	
	//로그아웃
	public void logout(MemberDto member) throws ClassNotFoundException, SQLException;

	
	
	
	
}
