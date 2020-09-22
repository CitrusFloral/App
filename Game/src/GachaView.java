import java.util.InputMismatchException;
import java.util.Scanner;

public class GachaView {
	private Scanner sc=new Scanner(System.in);
	
	//앱 초기화면 선택지
	public int getMenu() {
		System.out.println("1.종료\n2.가위바위보 게임\n3.뽑기 시뮬레이터\n4.강화 시뮬레이터\n5.원카드 하이로우");
		System.out.print("선택:");
		int choice=0;
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
	
	public int getGachaMenu() {
		//가챠 시뮬레이터 내부 선택지
		System.out.println("\n1.뒤로가기\n2.시뮬레이터 실행 \n3.확률표\n4.등장목록");
		System.out.print("선택:");
		int choice=0;
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