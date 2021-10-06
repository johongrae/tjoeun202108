package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Server {
	public static void main(String[] args) {
		try(ServerSocket serverSocket = new ServerSocket(7777);Socket socket = serverSocket.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){
			
			System.out.println("서버 오픈");
			
			//클라이언트로 보내자
			bw.write("단어 암기 프로그램이 시작되었습니다.");
			bw.newLine();	
			bw.flush();
			while(true) {
				bw.write("-----------메인창-----------");
				bw.newLine();
				bw.write("[1. 로그인  2. 회원가입  3. 랭킹확인]");
				bw.newLine();
				bw.flush();
				

				
				
				System.out.println(br.read());
//				switch(main){
//					case 1 : 
//						QuizDao quizDao = QuizDaoIpl.getInstance();
//						
//						bw.write("-----------로그인 창-----------");
//						bw.write("아이디: ");
//						String id = br.readLine();
//					
//						
//						bw.write("비밀번호: ");
//						String pw = br.readLine();
//						
//						
//						List<MemberDto> memberList = quizDao.login(id, pw);
//						
//						if(memberList.size() == 1) {
//							System.out.println("로그인 성공");
//						}else{
//							System.out.println("로그인 실패");
//						}
//					 
//						
//				}
				
			}
			
			
			
			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
