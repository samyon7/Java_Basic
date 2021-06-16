//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class Main{
	public static void main(String[] args){
		double p = 7;
		double l = 6.5;
		double hasil = hitungLuas(p,l); // First function
		
		System.out.println("Luas adalah : "+hasil);
		
		hitungLuas_2(2,3.5); // Second function
	}
	
	// Using returned value
	public static double hitungLuas(double p,double l){
		double luas = p * l;
		System.out.println("Luas adalah : "+luas);
		return luas;
	}
	
	// Without returned value
	public static void hitungLuas_2(double p, double l){
		double luas = p * l;
		System.out.println("Luas hitung2 adalah : "+luas);
	}
}