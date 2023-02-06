package week3.day1;

public class LeranReplaceAll {
public static void main(String[] args) {
	String text="Amazon development center has 25,543 employees in chennai";
	
	String name="Kannan";
	String replace = name.replace('n', '@');
	
	System.out.println(replace);
	text.replaceAll(name, replace);
	
	String replaceAll = text.replaceAll("[^0-9]", "");
	System.out.println(replaceAll);
	
	char[] charArray = text.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		if(Character.isDigit(charArray[i])) {
			System.out.println(charArray[i]);
		}
		
		if(charArray[i]>=48&&charArray[i]<=57) {
			System.out.println("Ascii "+charArray[i]);
			
		}
	}
}
}
