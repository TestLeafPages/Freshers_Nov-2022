package week5.day1;

public class AndroidMobile extends Mobile {

	public void takePhoto() {
		System.out.println("Take photo"); 
		
	}
	public void videoCall() {
		System.out.println("Video call");
	}
	
	public static void main(String[] args) {
		AndroidMobile mobile=new AndroidMobile();
		mobile.makeCall();
		mobile.sendMsg();
		mobile.takePhoto();
		mobile.videoCall();
	}
}
