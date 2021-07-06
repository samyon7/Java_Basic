public class Kelas_A{
	private int memberA = 5;
	
	double memberB = 5.0;
	double memberC = 10.0;
	
	private int functionA(){
		return memberA;
	}
	
	int functionB(){
		int hasil = functionA() + memberA;
		return hasil;
	}
	
	protected void methodC(){
		System.out.println("Access Modifier!!");
	}
}