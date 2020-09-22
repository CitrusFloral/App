public class EnchantRun {
	
	public void EnchantApp() {
		int choice=0;
		EnchantView enchantView=new EnchantView();
		Enchant enchant=new Enchant();
		while(true) {
			choice=enchantView.getMenu();
			
			switch(choice) {
			
			case 1:
				System.out.println("\n초기 화면입니다.\n");
				return;
				
			case 2:
				enchant.Enchantment();
				break;
				
			default:
				System.out.println("----------\n잘못된 입력입니다.\n----------");
			}
		}
	}
}
