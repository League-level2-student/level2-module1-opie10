package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> Intro = new ArrayList<String>();
		//2. Add five Strings to your list
		Intro.add("hi");
		Intro.add("hoi");
		Intro.add("hello");
		Intro.add("why hello there");
		Intro.add("ih");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i <Intro.size(); i++) {
			System.out.println(Intro.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String fel : Intro) {
			System.out.println(fel);
		}
		//5. Print only the even numbered elements in the list.
	for (int i = 0; i < Intro.size(); i+=2) {
		
		System.out.println(Intro.get(i));
	}
			
		//6. Print all the Strings in reverse order.
		for (int i = Intro.size()-1; i >= 0 ; i--) {
			
			System.out.println(Intro.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int j = 0; j < Intro.size(); j++) {
			if () {
				
			}
			
			System.out.println(Intro.get(i));
		}
		
		
		
	}
}
