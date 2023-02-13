package javapgm;

public class PrintDigit {
public static void main(String[] args) {
	String text="testleaf4410@gmail.com";
	
	//String replaceAll = text.replaceAll("[0-9]", "");
	
	//System.out.println(replaceAll);
	
	char[] charArray = text.toCharArray();
	for (int j = 0; j < charArray.length; j++) {
		
	if(charArray[j]>=48 &&charArray[j]<=57) {
		System.out.println(charArray[j]);
	}
//	if (Character.isDigit(charArray[j])) {
//		System.out.println(charArray[j]);
//	}
		
	}
}
}
