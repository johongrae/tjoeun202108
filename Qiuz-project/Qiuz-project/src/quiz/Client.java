package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		//클라이언트에서 사용자로부터 입력받아서 서버로 보내고
		Scanner scan = new Scanner(System.in);
		
		try(Socket socket = new Socket("172.30.1.19", 7777);
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){
			
			while(true) {
				String msg = br.readLine(); 
				System.out.println(">>> : "+msg);
				
				String str = scan.nextLine();
				bw.write(str);
				bw.newLine();
				bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

}
