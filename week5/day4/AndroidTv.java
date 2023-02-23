package week5.day4;

public abstract  class AndroidTv implements AndroidDesign {

	public void increseVolume() {
		System.out.println("Increse Volume");
	}
	public void switchOnTv() {
		System.out.println("switchOnTv");
	}
	public abstract void enableWifi() ;
		
	public void makeCall() {
		System.out.println("make call");
	}
	
	public static void main(String[] args) {
		//AndroidTv tv=new AndroidTv();
	}
	
}
