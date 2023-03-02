package week6.day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	//Set<String> name =new LinkedHashSet<String>();
	//Set<String> name =new TreeSet<String>();
	Set<String> name =new HashSet<String>();
	//To add the item in list
	boolean add = name.add("Murali");
	System.out.println(add);
	name.add("Wajid");
	name.add("Sathish");
	name.add("Dharun");
	name.add("Prakash");
	//System.out.println(name);
	boolean add2 = name.add("Murali");
	System.out.println(add2);
	List<String> val=new ArrayList<String>(name);
	System.out.println(val);
}
}
