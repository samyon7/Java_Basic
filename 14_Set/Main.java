import java.util.*;

public class Main{
	public static void main(String[] args){
		Set<String> Planets = new HashSet<>();
		
		Planets.add("merkurius");
		Planets.add("venus");
		Planets.add("bumi");
		Planets.add("bumi");
		Planets.add("bumi");
		Planets.add("mars");
		Planets.add("jupiter");
		
		System.out.println("Size awala : "+Planets.size());
		System.out.println("Sets of planets are :\n");
		
		for(String Planet : Planets){
			System.out.println("Salah satunya : "+Planet);
		}
		
		Planets.remove("venus"); // To remove one elements of plantes
		
		
		System.out.println("\n\nSize awala : "+Planets.size());
		System.out.println("Sets of planets are :\n");
		for(String Planet : Planets){
			System.out.println("Salah satunya : "+Planet);
		}
	}
}