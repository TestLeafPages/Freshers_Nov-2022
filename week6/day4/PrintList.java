package week6.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintList {
public static void main(String[] args) {
	String[] companyName= {"CTS","Hcl","Zoho","Google","qeagle"};
	
	List<String> organization=new ArrayList<String>();
	
	for (int i = 0; i < companyName.length; i++) {
		organization.add(companyName[i]);
	}
	System.out.println(organization);
	Collections.sort(organization);
	System.out.println(organization);
	Collections.reverse(organization);
	System.out.println(organization);
}
}
