public class Main{
	public static void main(String[] args){
		int a = 5;
		int hasil_a = +a; // Change to positive
		System.out.println("Hasil +5 = "+hasil_a);
		
		int b = 5;
		int hasil_b = -b; // Change to negative
		System.out.println("Hasil -5 = "+hasil_b);
		
		int c = 5;
		int hasil_c = c++;
		System.out.println("Hasil increment = "+hasil_c);
		
		int d = 5;
		int hasil_d = d++;
		System.out.println("Hasil decrement = "+hasil_d);
		
		boolean e = false;
		System.out.println("!False = "+!e);
	}
}