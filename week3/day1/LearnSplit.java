package week3.day1;

public class LearnSplit {
public static void main(String[] args) {
	String text="I like chicken   Briyani";
	//Split String 
	String[] split = text.split("\\s+");
	//initialize the count variable as 0
	int count=0;
	System.out.println(split.length);
	//Iterate the words
	for (int i = 0; i < split.length; i++) {
		//increse the count
		count++;
		System.out.println(split[i]);
	}
	System.out.println(count);
}
}
