public class Main{
	public static void main(String[] args){
		// Just For
		int i;
		for(i=0;i<10;i++){
			System.out.println(i+1);
		}
		
		System.out.println("\n\n");
		
		// Nested For
		int a=5;
		for(i=0;i<=a;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// Using While
		int value = 1;
		while (value <= 10){
			System.out.println(value);
			value++;
		}
		
		// Using Do-While
		int value_2 = 1;
		do{
			System.out.println(value_2);
			value_2++;
		}while(value_2<=10);
	}
}