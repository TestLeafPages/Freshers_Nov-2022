package assignment;

public class LearnJump {
public static void main(String[] args) {
	for (int i = 1; i <=7; i++) {
		if(i==5) {
			System.out.println("Five");
		//	continue;//To skip the current iteration,
			///it will continue the next iteration			
			break;//Terminate the loop
		}
		System.out.println(i);
	}
}
}
