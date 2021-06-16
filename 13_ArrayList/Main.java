import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main{
	public static void main(String[] args){
		// Collection Type
		Collection collection;
		
		// LIST
		// We start from Array
		String[] heroes = new String[2];
		heroes[0] = "Riki";
		heroes[1] = "Sven"; // After that, we can't add more because this is static memory!
		
		// Next we use ArrayList
		List<String> Planets = new ArrayList<>();
		Planets.add("Merkurius"); // Use add to insert the new elements
		Planets.add("Venus");
		Planets.add("Bumi");
		Planets.add("Mars");
		Planets.add("Jupiter"); // U can continue the add function because this's dynamic memory
		
		for(int loop = 0;loop<Planets.size(); loop++){
			System.out.println("Index "+(loop+1)+" adalah : "+Planets.get(loop));
		}
		
		System.out.println("\nAfter that, we use remove function to remove element from arraylist\n");
		
		Planets.remove("Venus");
		
		for(int loop = 0;loop<Planets.size(); loop++){
			System.out.println("Index "+(loop+1)+" adalah : "+Planets.get(loop));
		}
		
	}
}