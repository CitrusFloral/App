import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RPSView {

	private Scanner sc=new Scanner(System.in);
	private int win=0;
	private int lose=0;
	private int same=0;
	private DecimalFormat form = new DecimalFormat("#.#");
		
		//가위바위보 게임 선택지
		public void RandomChoice() {
			
			String[] nameArr= {"가위","바위","보"};
			Random random=new Random();
			int index=random.nextInt(nameArr.length);
			
			System.out.println("『");
			System.out.println("   1.가위");
			System.out.println("   2.바위");
			System.out.println("   3.보");
			System.out.println("                              』");
			System.out.println("입력:");
			
			//선택지 입력 후 결과창
			try {
				int num = sc.nextInt();
				
				System.out.println("--------------");
				if(num==1) {
					for(int i=0; i<1; i++) {
						if(nameArr[index].equals("보")) {
							System.out.println("당신은 가위를 냈고, 상대방은 보를 냈습니다."
									         + "\n결과는 당신의 승리 입니다.");
							win++;
						}else if(nameArr[index].equals("바위")){
							System.out.println("당신은 가위를 냈고, 상대방은 바위를 냈습니다."
									         + "\n결과는 당신의 패배 입니다.");
							lose++;
						}else if(nameArr[index].equals("가위")){
							System.out.println("당신은 가위를 냈고, 상대방도 가위를 냈습니다."
									         + "\n결과는 무승부 입니다.");
							same++;
						} 
					}
				}
						else if(num==2) {
							for(int z=0; z<1; z++) {
									if(nameArr[index].equals("가위")){
										System.out.println("당신은 바위를 냈고, 상대방은 가위를 냈습니다.\n결과는 당신의 승리 입니다.");
										win++;
									}else if(nameArr[index].equals("보")) {
										System.out.println("당신은 바위를 냈고, 상대방은 보를 냈습니다.\n결과는 당신의 패배 입니다.");
										lose++;
									}else if(nameArr[index].equals("바위")){
										System.out.println("당신은 바위를 냈고, 상대방도 바위를 냈습니다.\n결과는 무승부 입니다.");
										same++;
		}		
							}
						}
						else if(num==3){
							for(int x=0; x<1; x++) {
							if(nameArr[index].equals("바위")){
								System.out.println("당신은 보를 냈고, 상대방은 바위를 냈습니다.\n결과는 당신의 승리 입니다.");
								win++;
							}else if(nameArr[index].equals("가위")){
								System.out.println("당신은 보를 냈고, 상대방은 가위를 냈습니다.\n결과는 당신의 패배 입니다.");
								lose++;
							}else if(nameArr[index].equals("보자기")) {
								System.out.println("당신은 보를 냈고, 상대방도 보를 냈습니다.\n결과는 무승부 입니다.");
								same++;
	}
							}
						}
					else{
						System.out.println("잘못된 입력입니다.");
								}
			
				System.out.println("--------------");
			}
			catch(InputMismatchException e) {
				sc.nextLine(); //이게 없으면 catch문이 무한루프
				System.out.println("--------------\n잘못된 입력입니다.\n--------------");
			}
}
		public void checkWinRate() {
			//간단한 승률 통계
			int num1=win+lose+same;
			double num=win+lose+same;
			double winRate=(win*100)/num;	
			System.out.println("통산 전적:"+num1+"전 "+win+"승 "+lose+"패 "+same+"무\n승률:"+form.format(winRate)+"%\n");
		}
}