public class HighLowAppRun {
	
	public void HighLowApp() {
		int choice=0;
		HighLowRule highLowRule=new HighLowRule();
		HighLowView highLowView=new HighLowView();
		HighLow highLow=new HighLow();
		while(true) {
			choice=highLowView.getMenu();
			
			switch(choice) {
			
			case 1:
				System.out.println("\n초기 화면입니다.\n");
				return;
				
			case 2:
				highLow.InGame();
				break;
				
			case 3:
				highLowRule.HighLowGuide();
				break;
				
			default:
				System.out.println("----------\n잘못된 입력입니다.\n----------");
			}
		}
	}
}
