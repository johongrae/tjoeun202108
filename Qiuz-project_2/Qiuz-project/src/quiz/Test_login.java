package quiz;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;



public class Test_login {
	public static void main(String[] args) {
		QuizDao quizDao = QuizDaoIpl.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("아이디");
			String id = scan.next();
			System.out.println("비밀번호");
			String pw = scan.next();
			List<MemberDto> memberList = quizDao.login(id, pw);
			
		
				if(memberList.size() == 1) {
					System.out.println("로그인 성공");
				}else{
					System.out.println("로그인 실패");
				}
				
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
