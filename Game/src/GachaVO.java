import java.util.Arrays;

public class GachaVO {
	//가챠 내용물
	String[] charL = {"테스트L","테스트L2","테스트L3","테스트L4"};
	String[] charSSR = {"테스트SSR","테스트SSR2","테스트SSR3","테스트SSR4"};
	String[] charSR = {"테스트SR","테스트SR2","테스트SR3","테스트SR4"};
	String[] charR = {"테스트R","테스트R2","테스트R3","테스트R4"};

	public String[] getCharSSR() {
		return charSSR;
	}
	public void setCharSSR(String[] charSSR) {
		this.charSSR = charSSR;
	}
	public String[] getCharSR() {
		return charSR;
	}
	public void setCharSR(String[] charSR) {
		this.charSR = charSR;
	}
	public String[] getCharR() {
		return charR;
	}
	public void setCharR(String[] charR) {
		this.charR = charR;
	}
	
	public String[] getCharL() {
		return charL;
	}
	public void setCharL(String[] charL) {
		this.charL = charL;
	}
	//toString으로 뽑기 등장표 바로 출력
	@Override
	public String toString() {
		return "\n뽑기 등장표 \n\n"+
				"*Legend="+Arrays.toString(charL)+"\n\n"+
				" SSRare=" + Arrays.toString(charSSR)+"\n"+
				"  SRare=" + Arrays.toString(charSR) +"\n"+
				"   Rare="+ Arrays.toString(charR);
	}
}