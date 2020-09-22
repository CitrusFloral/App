import java.text.DecimalFormat;

//넣었던 뽑기의 내용물을 랜덤으로 추첨해 출력하는 곳
public class Gacha {
		private int c=0;
		private int l=0;
		private double c2=0;
		private DecimalFormat form = new DecimalFormat("#.###"); 
//		private DecimalFormat form = new DecimalFormat("#.###"); 소수점 자르기
//		System.out.println("SSR 평균 등장 확률:"+form.format(z)+"%");

	public void GachaApp() {
		GachaArr gachaArr=new GachaArr();
        double rand;
        //1~9회째의 뽑기 알고리즘
        for (int i = 1; i <= 9; i++)
        {	//Math.random() * ((y-x)+1) + x = 1부터 100의 숫자 랜덤굴림. x는 최소값이며 y는 최대값이 된다.
        	//if 최대값을 1000으로 하면 가챠 확률을 0.1%씩 세분화할 수 있다.
/*       	x=100(max) y=2(min)
       		rand = (int) (Math.random() * x); = 0부터 99까지 출력 (max가 100일경우) = 0.000~0.049와 9.49~9.99가 Rare로 들어가지만 확률은 동일하다.
        	rand = (int) (Math.random() * (x+1)); = 0부터 101까지 출력 (max만 1 증가 = else의 범위가 1 늘어나 Rare 확률이 1% 더 높아져버린다.
        	rand = (int) (Math.random() * (x+1-y))+y; //2부터 100까지 출력(최소값 지정)
        	rand = (int) (Math.random() * x)+1; = 1부터 100까지 출력 = min,max 둘다 1증가
*/        	rand = (int) (Math.random() * (100+1-1))+1; //1부터 100까지 출력 = 가장 확실하다.
            
            //1~100중 1에 해당할 때 = 확률 1%
            if( 1 <= rand && rand<= 1) {
            	for(int x=0; x<1; x++)
            		System.out.println("*Legend: "+gachaArr.getRandomL(1));
            	l++; //이 항목에 해당할 때에 l을 ++시켜서 L등급 확률표 통계에 합산
            }
            //1~100중 2~6에 해당할 �� = 확률 5%
            else if ( 2 <= rand && rand <=  6 ) {
            	for(int x=0; x<1; x++) 
                System.out.println(" SSRare: "+gachaArr.getRandomSSR(1));  
            	c++; //이 항목에 해당할 때에 c를 ++시켜서 SSR등급 확률표 통계에 합산
            }
            //1~100중 7~21에 해당할 �� = 확률 15%
            else if ( 7 <= rand && rand <=  21  ) {
            	for(int x=0; x<1; x++)
                System.out.println("  SRare: "+gachaArr.getRandomSR(1));
            }
            //1~100중 22~100에 해당할때 = 확률 79%
            else
            	for(int x=0; x<1; x++)
                {
            	System.out.println("   Rare: "+gachaArr.getRandomR(1));
                }
        }
        //가챠를 시행할 때마다 수를 10회씩 추가해 확률을 도출함.
        c2+=10; //c2=가챠 시행 횟수
        
        // 마지막은 무조건 SR 이상 등급이 나오며, SSR의 확률이 10% SR의 확률이 90%로 보정
        rand = (int) (Math.random() * (100 + 1 - 1) + 1);
        
        if( 1 <= rand && rand<= 1) {
        	for(int x=0; x<1; x++)
        		System.out.println("*Legend: "+gachaArr.getRandomL(1));
        	l++;
        }
        else if ( 2 <= rand && rand <=  10 ) {
            System.out.print(" SSRare: "+gachaArr.getRandomSSR(1));
        	c++;
        	}
        else if ( 11 <= rand && rand <=  100  ) {
            System.out.print("  SRare: "+gachaArr.getRandomSR(1));
        }
        System.out.println();
        System.out.println();
	}
	
	public void checkSSR() {	
		//가챠 확률 공식
		//ex) 20연으로 SSR 3개 획득시 ((3)*100)/20 = 15%
		double z=((c)*100)/c2;
		double l2=((l)*100)/c2;
		
		System.out.println("*Legend 획득 수:"+l+"개\n"+"*Legend 평균 등장 확률:"+form.format(l2)+"%\n");
		System.out.println(" SSRare 획득 수:"+c+"개\n"+" SSRare 평균 등장 확률:"+form.format(z)+"%\n");
	}
}
	

