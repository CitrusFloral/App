import java.util.Scanner;

public class HighLow {

	private Scanner sc=new Scanner(System.in);
	private int player;
	private int enemy;
	private int point;
	private int life=3;

	public void InGame() {
		String[] str= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		player = (int) (Math.random() * 13);
		enemy = (int) (Math.random() * 13);

		while(true) {
				System.out.println("\n현재 점수: " +point+"점");
				System.out.println("현재 라이프:"+life+"개");
				System.out.println("\n당신의 카드: "+str[player]+"\n");
        		System.out.println("1.HIGH");
        		System.out.println("2.LOW");
        		System.out.println("선택:");

        		int num = sc.nextInt();
        		if(1<life) {
        			switch(num) {
        			
	        		case 1:	//HIGH
	        		
	        		if(player==enemy) {
	       			 System.out.println("\n무승부입니다. 1점 획득합니다.");
	       			 System.out.println("내 카드: "+str[player]);
	       			 System.out.println("상대 카드: "+str[enemy]);
	       			 point++;
	        		}
	       			 
	       		 else if (player>enemy){
	       			 System.out.println("\n이겼습니다. 2점 획득합니다.");
	       			 System.out.println("내 카드: "+str[player]);
	       			 System.out.println("상대 카드: "+str[enemy]);
	       			 point+=2;

	       		 }else if(player<enemy) {
	       			 System.out.println("\n졌습니다." );
	       			 System.out.println("내 카드: "+str[player]);
	       			 System.out.println("상대 카드: "+str[enemy]);
	       			 life--;        		
        			}
	        		return;
	        		case 2: //LOW
	        			if(num==2) {
	        				
	        				if(player==enemy) {
	          			 System.out.println("\n무승부입니다. 1점 획득합니다.");
	          			 System.out.println("내 카드: "+str[player]);
	          			 System.out.println("상대 카드: "+str[enemy]);
	          			 point++;
	          	
	          		 }else if (player<enemy){
	          			 System.out.println("\n이겼습니다. 2점 획득합니다.");
	          			 System.out.println("내 카드: "+str[player]);
	          			 System.out.println("상대 카드: "+str[enemy]);
	          			 point+=2;
	          
	          		 }else if(player>enemy) {
	          			 System.out.println("\n졌습니다." );
	          			 System.out.println("내 카드: "+str[player]);
	          			 System.out.println("상대 카드: "+str[enemy]);
	          			 life--;
	        			}
	        			}return;
	        			
	        		default: //오류
	        			System.out.println("잘못된 입력입니다.");
        		}
		
		}	else if(1==life) { //패배했을 때
        			System.out.println("\n졌습니다." );
         			System.out.println("내 카드: "+str[player]);
         			System.out.println("상대 카드: "+str[enemy]);
        			System.out.println("\n게임이 끝났습니다.\n당신의 점수는 "+point+"점입니다.\n");
        			life=3;
        			point=0;
        			break;
        		}
        }
	}
}
