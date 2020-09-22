import java.util.Random;
class GachaArr {
	
	private Random random = new Random();
	private GachaVO gachaVO=new GachaVO();
	//뽑기의 내용물을 만드는 곳
	//gachaVO클래스의 charL에서 랜덤한 문자열을 뽑아 buffer에 추가
	
	
	public String getRandomL(int length) {
		StringBuffer buffer = new StringBuffer();
		for ( int i=0 ; i<length ; i++ ) {
			buffer.append(gachaVO.charL[random.nextInt(gachaVO.charL.length)]); 
	}
		return buffer.toString();
	}
	
	public String getRandomSSR(int length) {
		StringBuffer buffer = new StringBuffer();
		for ( int i=0 ; i<length ; i++ ) {
			buffer.append(gachaVO.charSSR[random.nextInt(gachaVO.charSSR.length)]);
	}
		return buffer.toString();
	}
	
	public String getRandomSR (int length) {
		StringBuffer buffer = new StringBuffer();
		for ( int i=0 ; i<length ; i++ ) {
			buffer.append(gachaVO.charSR[random.nextInt(gachaVO.charSR.length)]);
		}
		return buffer.toString();
	}
	
	public String getRandomR(int length) {
		StringBuffer buffer = new StringBuffer();	
		for ( int i=0 ; i<length ; i++ ) {
			buffer.append(gachaVO.charR[random.nextInt(gachaVO.charR.length)]);
		}
		return buffer.toString();
	}
}