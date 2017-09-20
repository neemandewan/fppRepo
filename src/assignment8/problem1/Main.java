package assignment8.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 985955
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Marketing> list  = new ArrayList<Marketing>();
		
		// Adding objects to the Marketing list
		list.add(new Marketing("name01", "product1", 2000));
		list.add(new Marketing("name05", "product2", 1000));
		list.add(new Marketing("name06", "product3", 500));
		list.add(new Marketing("name08", "product4", 200));
		list.add(new Marketing("name10", "product5", 1200));
		list.add(new Marketing("name19", "product6", 3000));
		list.add(new Marketing("name03", "product7", 1200));
		
		Marketing m1 = new Marketing("name8", "product8", 7000);
		list.add(m1);
		System.out.println("Added List --> " + list);
		
		// Removing objects from Marketing
		list.remove(0);
		list.remove(m1);
		System.out.println("\nRemoved List --> " + list);
		
		// Size of the list
		System.out.println("\nSize of the list --> " + list.size());
		
		// Set objects from Marketing
		list.set(0, new Marketing("Editedname2", "Editedproduct2", 300));
		System.out.println("\nSet List 0 --> " + list);
		
		
		//Sort the list in natural order for the field salesamount using comparator interface
		Collections.sort(list, new SalesAmountComparator());
		System.out.println("\nSort by sales amount --> " + list);
		
		List<Marketing> ml = listMoreThan1000(list);
		Collections.sort(ml, new SalesAmountComparator());
		System.out.println("\nSort by sales amount --> " + ml);
	}
	
	public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		 List<Marketing> res = new ArrayList<Marketing>();
		 
		 for(Marketing m: list) {
			 if(m.getSalesAmount() > 1000) {
				 res.add(m);
			 }
		 }
		 
		 return res;
	}

}

/**
	OUTPUT:-
	Added List --> [name01 product1 2000.0
	, name05 product2 1000.0
	, name06 product3 500.0
	, name08 product4 200.0
	, name10 product5 1200.0
	, name19 product6 3000.0
	, name03 product7 1200.0
	, name8 product8 7000.0
	]
	
	Removed List --> [name05 product2 1000.0
	, name06 product3 500.0
	, name08 product4 200.0
	, name10 product5 1200.0
	, name19 product6 3000.0
	, name03 product7 1200.0
	]
	
	Size of the list --> 6
	
	Set List 0 --> [Editedname2 Editedproduct2 300.0
	, name06 product3 500.0
	, name08 product4 200.0
	, name10 product5 1200.0
	, name19 product6 3000.0
	, name03 product7 1200.0
	]
	
	Sort by sales amount --> [name08 product4 200.0
	, Editedname2 Editedproduct2 300.0
	, name06 product3 500.0
	, name03 product7 1200.0
	, name10 product5 1200.0
	, name19 product6 3000.0
	]
	
	Sort by sales amount --> [name03 product7 1200.0
	, name10 product5 1200.0
	, name19 product6 3000.0
	]
*/