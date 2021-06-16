//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class Main{
	public static void main(String[] args){
		double p = 7;
		double l = 6.5;
		double hasil = hitungLuas(p,l); // First function
		
		int pn = 5;
		int ln = 6;
		int hasiln = hitungLuas(pn,ln); // Second function after use overloading method
	}
	
	public static double hitungLuas(double p,double l){
		double luas = p * l;
		System.out.println("Luas adalah : "+luas);
		return luas;
	}
	
	// Using overloading method
	public static int hitungLuas(int p, int l){
		int luas = p * l;
		System.out.println("Luas adalah : "+luas);
		return luas;
	}
}