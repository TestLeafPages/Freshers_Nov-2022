package week5.day1;

public class Audi extends Car{
	public void openSunRoff() {
		System.out.println("Open Sun Roof");
	}
	public static void main(String[] args) {
		Audi audi=new Audi();
		audi.applyBreak();
		audi.openSunRoff();
		audi.soundHorn();
		audi.turnOnLight();
	}
}
