package testArrayList;

import java.util.ArrayList;

public class testArrayList {

	public static void main(String[] args) {
		// ArrayList = a re-sizable array
		//Elements can be added and removed after compilation phase
		//store reference data types
	ArrayList<String> food = new ArrayList<String>();				
	food.add("Pitza");
	food.add("Hamburger");
	food.add("hotdog");						
	//food.set(0,"sushi");
	//food.remove(2);
	//food.clear();			
	for(int i=0; i<food.size(); i++) {
	System.out.println(food.get(i));
}
	}

}
