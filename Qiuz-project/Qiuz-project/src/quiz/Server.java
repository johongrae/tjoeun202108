package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {

		//서버에서도 사용자로부터 입력받아서 클라이언트로 보내자!
		//192.168.0.111


		try(ServerSocket serverSocket = new ServerSocket(7777);
				Socket socket = serverSocket.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){
			
			Scanner scan = new Scanner(System.in);

			while(true) {
				String str = scan.nextLine();
				bw.write(str);
				bw.newLine();
				bw.flush();
				
				String msg = br.readLine();
				System.out.println(">>> : "+msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
