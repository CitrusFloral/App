import java.util.InputMismatchException;
import java.util.Scanner;

public class EnchantView {
	private Scanner sc=new Scanner(System.in);
	
	public int getMenu() {
		int choice=0;
		System.out.println("\n1.뒤로가기\n2.강화 시작");
		System.out.print("선택:");
		try {
			choice=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("----------\n잘못된 입력입니다.\n----------");
			return choice;
		}
		return choice;
	}
}