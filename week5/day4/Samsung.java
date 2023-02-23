package week5.day4;

public class Samsung implements AndroidDesign,SamsungDesign{

	public void makeCall() {
		System.out.println("Make call");
		
	}

	public void sendMsg() {
		System.out.println("Send msg");
		
	}

	public void switchOn() {
	System.out.println("Switch on");
	}

	public void takePhoto() {
System.out.println("Take photo");
	}
public void videoCall() {
	System.out.println("Video call");
}
public void shareDocument() {
System.out.println("ShareDocument");
}

public void takeScreenShot() {
	System.out.println("Take Screen shot");
}

public void samsungNote() {
	System.out.println("Samsung Note");
}

public void faceAuthendication() {
	System.out.println("Face Authendication");
}
	public static void main(String[] args) {
		Samsung mob=new Samsung();
		mob.switchOn();
		mob.videoCall();
		mob.takePhoto();
		mob.sendMsg();
		mob.makeCall();
		mob.faceAuthendication();
		mob.takeScreenShot();
		mob.samsungNote();
		
	//	AndroidDesign design=new AndroidDesign();
		
		
		
	//	AndroidDesign design=new Samsung();
		//AndroidDesign Design=new Samsung();
	SamsungDesign Design=new Samsung();
//		Design.switchOn();
//		Design.takePhoto();
//		Design.sendMsg();
//		Design.makeCall();
		
		
		Design.faceAuthendication();
		//Design.takeScreenShot();
		Design.samsungNote();
		
		//Design.videoCall();
		
		
		
	}

	public void takeScreenShot(int no) {
		// TODO Auto-generated method stub
		
	}

	

	
}
