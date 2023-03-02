package week6.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> name =new ArrayList<String>();
	//To add the item in list
	name.add("Murali");
	name.add("Wajid");
	name.add("Sathish");
	name.add("Dharun");
	name.add("Prakash");
	
	System.out.println(name);
	name.add("Murali");
	//to get the size of List
	int size = name.size();
	System.out.println(size);
	System.out.println(name);
	
	name.add(0, "Mani");
	System.out.println(name);
	
	//To get the particular item in this list
	String string2 = name.get(0);
	System.out.println("index  "+string2);
	
	
	for (int i = 0; i < name.size(); i++) {
		String string = name.get(i);
	//	System.out.println(string);
	}
	
	
	
	for (String localVariable : name) {
		System.out.println(localVariable);
	}
	//To check if the list is empty
	boolean empty = name.isEmpty();
	System.out.println(empty);
	
	//To clear the list
	//name.clear();
	System.out.println(name);
	//To check the elements if exists in this list
	boolean contains = name.contains("Wajid");
	System.out.println(contains);
	//to remove the particular element
	boolean remove = name.remove("Murali");
	System.out.println(remove);
	System.out.println(name);
	//Ascending order
	Collections.sort(name);
	//Descending order
	Collections.reverse(name);
	//to get minimum value in this list
	Collections.min(name);
	//to get maximum value in this list
	Collections.max(name);
	
}
}
