package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("Drive  Car");
	}
	public void applyBreak() {
		System.out.println("apply Break");
	}
   public	void sounHorn() {
		System.out.println("sounHorn");
	}
   public static void main(String[] args) {
	Car object=new Car();
	object.applyBreak();
	object.driveCar();
	object.sounHorn();
}
}
