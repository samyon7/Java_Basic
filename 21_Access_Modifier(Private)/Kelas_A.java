public class Kelas_A{
	private int memberA = 5;
	
	private int functionA(){
		return memberA;
	}
	
	int functionB(){
		int hasil = functionA() + memberA;
		return hasil;
	}
}