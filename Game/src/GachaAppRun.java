public class GachaAppRun {
	private int choice=0;
	private int num1=0,num2=0,num3=10,num4=30000;
	
	public void GachaAppRun1() {
		Gacha runGacha=new Gacha(); //가챠 연산 클래스
		GachaPercent runGachaPercent=new GachaPercent(); //가챠 확률 설명표 클래스
		GachaVO gachaVO=new GachaVO(); //가챠 내용물 객체 클래스
		GachaView gachaView=new GachaView();
		
		while(true) {
			choice=gachaView.getGachaMenu();
			
			switch(choice) {
			
			case 1:
				System.out.println("\n초기 화면입니다.\n");
				return;
			case 2:
				num1+=num3; //실행될 때마다 10+ (가챠 굴린 횟수
				num2+=num4; //실행될 때마다 30000+ (가챠에 쓴 금액
				runGacha.GachaApp(); //가챠 결과물 출력
				runGacha.checkSSR(); //SSR이상 등급이 몇 번 나왔는지 출력
				System.out.println("뽑은 횟수 :"+num1+"회\n사용 금액 :"+num2+"원\n");
				break;				
			case 3:
				runGachaPercent.GachaPro(); //가챠 확률 설명표
				break;
				
			case 4:
				System.out.println(gachaVO.toString()); //가챠 라인업 설명표
				System.out.println();
				break;
				
			default: //case 범위 내를 벗어난 선택을 했을 시
				System.out.println("\n----------\n잘못된 입력입니다.\n----------");
		}
	}
}
}
