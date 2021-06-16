//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Map<String, Planet_ADT> planets = new HashMap();
		
		// Here use put() to add new objects into a map
		planets.put("key-1",new Planet_ADT("Merkurius",0.06));
		planets.put("key-2",new Planet_ADT("Venus",0.01));
		planets.put("key-3",new Planet_ADT("Bumi",0.02));
		planets.put("key-4",new Planet_ADT("Mars",0.03));
		
		System.out.println("Key 4 is : "+planets.get("key-4"));
		// Way to print all
		for(String key : planets.keySet()){
			System.out.println(key+":"+planets.get(key));
		}
		
		// Remove objects
		planets.remove("key-2");
		System.out.println("After remove key-2 :\n");
		for(String key : planets.keySet()){
			System.out.println(key+":"+planets.get(key));
		}
	}
}