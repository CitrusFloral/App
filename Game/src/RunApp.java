public class RunApp {

	private GachaView run2=new GachaView();
	private RPSView runRPS=new RPSView();
	private GachaAppRun gachaAppRun=new GachaAppRun();
	private HighLowAppRun highLowAppRun=new HighLowAppRun();
	private EnchantRun enchantRun=new EnchantRun();
	
	public void runApp() {
		//1번화면
		//앱 초기화면 -> 2번 선택시 RPSView 의 RandomChoice로 진입
		//2번 실행시 GachaAppRun 의 GachaAppRun1로 진입
		int choice=0;
		
		while(true) {
			choice=run2.getMenu();
			switch(choice) {
				
				case 1:
					System.out.println("\n앱을 종료합니다..");
					return;
					
				case 2:
					runRPS.RandomChoice();
					runRPS.checkWinRate();
					break;
					
				case 3:
					gachaAppRun.GachaAppRun1();
					break;
					
				case 4:
					enchantRun.EnchantApp();
					break;
					
				case 5:
					highLowAppRun.HighLowApp();
					break;
					
				default:
					System.out.println("----------\n잘못된 입력입니다\n----------");
							
			}
			}

		}
	}





