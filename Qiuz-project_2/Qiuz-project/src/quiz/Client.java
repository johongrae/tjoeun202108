package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		try(Socket socket = new Socket("192.168.0.156", 7777);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){
			
			
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());

			int main = scan.nextInt();
			bw.write(main);
			bw.flush();
//			switch(main) {
//				case 1: 
//					System.out.println(br.readLine());
//					System.out.println(br.readLine());
//					String id = scan.nextLine();
//					bw.write(id);
//					bw.flush();
//					
//					System.out.println(br.readLine());
//					System.out.println(br.readLine());
//					String pw = scan.nextLine();
//					bw.write(pw);
//					bw.flush();
//			}
			
				
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
