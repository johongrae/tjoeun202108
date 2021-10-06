package quiz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordTest {
	public static void main(String[] args) {
		QuizDao quizDao = QuizDaoIpl.getInstance();
		
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int r = 1;
		try {
			while(r==1) {
		
				System.out.println("카테고리를 번호를 선택하세요");
				System.out.println("1. 과일, 야채  2. 동물  3. 사물");
				int category = scan.nextInt();
				System.out.println("난이도를 선태하세요");
				System.out.println("1. 가장 쉬움  2. 보통  3. 어려움");
				int level = scan.nextInt();
				List<WordDto> wordList = quizDao.word(category, level);
				
				switch(level) {
					case 1 : 
						int j = 1;
						List<String> anwerList = new ArrayList<String>();
						List<String> UanwerList = new ArrayList<String>();
						while(j < 11) {
							int i = (int)(Math.random()*18)+1;
							
//							System.out.println(j+". "+wordList.get(i).getKor()+" "+wordList.get(i).getEng()+" "+wordList.get(i).getLevel());
							
							anwerList.add(wordList.get(i).getEng());
							System.out.println(j+". "+wordList.get(i).getKor());
							j++;
						}
						for(int k = 0; k < anwerList.size(); k++) {
							System.out.println((k+1)+"번 답은?");
							String a = scan.next();
							UanwerList.add(a);
//							System.out.println(k);
//							System.out.println(anwerList.get(k));
//							System.out.println(UanwerList.get(k));
							if(anwerList.get(k).equals(UanwerList.get(k))) {
								score += 1;
								System.out.println("정답 +1점");
							}else {
								System.out.println((k+1)+"번은 틀렸습니다.");
							}
						}
						System.out.println("총점은: "+score);
						
						System.out.println("한 번더 플레이 하시겠습니까?");
						System.out.println("네: 1, 아니오: 2");
						r = scan.nextInt();
						if(r == 1) {
							continue;
						}else {
							break;
						}
						
					case 2 : 
						j = 1;
						while(j < 11) {
							int i = (int)(Math.random()*18)+1;
							
							System.out.println(j+". "+wordList.get(i).getKor()+" "+wordList.get(i).getEng()+" "+wordList.get(i).getLevel());
							j++;
						}
						System.out.println("한 번더 플레이 하시겠습니까?");
						System.out.println("네: 1, 아니오: 2");
						r = scan.nextInt();
						if(r == 1) {
							continue;
						}
						
					case 3 : 
						j = 1;
						while(j < 11) {
							int i = (int)(Math.random()*18)+1;
							
							System.out.println(j+". "+wordList.get(i).getKor()+" "+wordList.get(i).getEng()+" "+wordList.get(i).getLevel());
							j++;
						}
						System.out.println("한 번더 플레이 하시겠습니까?");
						System.out.println("네: 1, 아니오: 2");
						r = scan.nextInt();
						if(r == 1) {
							continue;
						}
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
