import java.util.Scanner;

public class Enchant {
	private Scanner sc=new Scanner(System.in);
	private int enchant;
	public void Enchantment() {
		
		enchant = (int) (Math.random() * 1000);
		
		System.out.println("현재 강화 수치를 입력하세요. [0~24]");
		System.out.println("선택:");
		while(true) {
			int num = sc.nextInt();
    		switch(num) {
    		
    		case 0:
    			
    		if(num==0) {
				if( 1 <= enchant && enchant<=950) {
	            		num++;
	            		System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
	            }
				else {
					System.out.println("강화 실패");
					System.out.println("현재 강화 수치: +" + num);
				}
			}
    		return;
    		
    		case 1:
       			 
    			if(num==1) {
    				if( 1 <= enchant && enchant<= 900) {
    	            		num++;
    	            		System.out.println("강화 성공");
    	            		System.out.println("현재 강화 수치: +" + num);
    	            }
    				else {
    					System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
    				}
    			}
        		return;
        		
        	case 2: 
        		
        		if(num==2) {
    				if( 1 <= enchant && enchant<= 850) {
    	            		num++;
    	            		System.out.println("강화 성공");
    	            		System.out.println("현재 강화 수치: +" + num);
    	            }
    				else {
    					System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
    				}
    			}
        		return;
        		
        	case 3: 
        		
        		if(num==3) {
        			if( 1 <= enchant && enchant<= 850) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else {
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        		}
        		return;
        		
        	case 4: 
        		
        		if(num==4) {
        			if( 1 <= enchant && enchant<= 800) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else {
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        		}
        		return;
        		
        	case 5: 
        		
        		if(num==5) {
        			if( 1 <= enchant && enchant<= 750) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else {
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        		}
        		return;
        		
        	case 6: 
        		
        		if(num==6) {
        			if( 1 <= enchant && enchant<= 700) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else {
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        		}
        		return;
        		
        	case 7: 
        		
        		if(num==7) {
        			if( 1 <= enchant && enchant<= 650) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else {
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        		}
        		return;
        		
        	case 8: 
        		
        		if(num==8) {
        			if( 1 <= enchant && enchant<= 600) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else {
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        		}
        		return;
        		
        	case 9: 
        		
        		if(num==9) {
        			if( 1 <= enchant && enchant<= 550) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else {
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        		}
        		return;
        		
        	case 10: 
        		
        		if(num==10) {
        			if( 1 <= enchant && enchant<= 500) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else {
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        		}
        		return;
        		
        	case 11: 
        		
        		if(num==11) {
        			if( 1 <= enchant && enchant<= 450) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        		}
        		return;
        		
        		case 12: 
        		
        		if(num==12) {
        			if( 1 <= enchant && enchant<= 400) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 401 <= enchant && enchant<= 994) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}else if( 995 <= enchant && enchant<= 1000){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 13: 
        		
        		if(num==13) {
        			if( 1 <= enchant && enchant<= 350) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 351 <= enchant && enchant<= 987) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 988 <= enchant && enchant<= 1000){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 14: 
        		
        		if(num==14) {
        			if( 1 <= enchant && enchant<= 300) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 301 <= enchant && enchant<= 986) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 987 <= enchant && enchant<= 1000){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 15: 
        		
        		if(num==15) {
        			if( 1 <= enchant && enchant<= 300) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 301 <= enchant && enchant<= 979) {
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 980 <= enchant && enchant<= 1000){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 16: 
        		
        		if(num==16) {
        			if( 1 <= enchant && enchant<= 300) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 301 <= enchant && enchant<= 979) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 980 <= enchant && enchant<= 100){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 17: 
        		
        		if(num==17) {
        			if( 1 <= enchant && enchant<= 300) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 301 <= enchant && enchant<= 979) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 980 <= enchant && enchant<= 1000){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 18: 
        		
        		if(num==18) {
        			if( 1 <= enchant && enchant<= 300) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 301 <= enchant && enchant<= 972) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 973 <= enchant && enchant<= 100){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 19: 
        		
        		if(num==19) {
        			if( 1 <= enchant && enchant<= 300) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 301 <= enchant && enchant<= 972) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 973 <= enchant && enchant<= 1000){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 20: 
        		
        		if(num==20) {
        			if( 1 <= enchant && enchant<= 300) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 301 <= enchant && enchant<= 930) {
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 931 <= enchant && enchant<= 100){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 21: 
        		
        		if(num==21) {
        			if( 1 <= enchant && enchant<= 300) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 301 <= enchant && enchant<= 930) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 931 <= enchant && enchant<= 1000){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 22: 
        		
        		if(num==22) {
        			if( 1 <= enchant && enchant<= 30) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 31 <= enchant && enchant<= 806) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 807 <= enchant && enchant<= 1000){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 23: 
        		
        		if(num==23) {
        			if( 1 <= enchant && enchant<= 20) {
        				num++;
        				System.out.println("강화 성공");
	            		System.out.println("현재 강화 수치: +" + num);
        			}
        			else if( 21 <= enchant && enchant<= 706) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}else if( 707 <= enchant && enchant<= 1000){
        				System.out.println("\n장비가 파괴되었습니다." );
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        		
        	case 24: 
        		
        		if(num==24) {
        			if( 1 <= enchant && enchant<= 10) {
        				num++;
        				System.out.println("강화 성공!");
        				System.out.println("최대 강화 +25 에 도달했습니다. ");
        			}
        			else if( 11 <= enchant && enchant<= 604) {
        				num--;
        				System.out.println("강화 실패");
	            		System.out.println("현재 강화 수치: +" + num);
        			}else if( 605 <= enchant && enchant<= 1000){
        				System.out.println("\n장비가 파괴되었습니다.");
	            		System.out.println("최종 강화 수치: +" + num);
        				return;
        			}
        		}
        		return;
        			
        		default: //오류
        			System.out.println("잘못된 입력입니다.");
    		}
		}
	}	
}

