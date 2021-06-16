public class Hewan_ADT{
	String nama;
	int berat;
	int jumlahKaki;
	
	// Like void in C programming
	public void printNama(String nama_hewan){
		nama = nama_hewan;
	}
	
	public void printBerat(int berat_hewan){
		berat = berat_hewan;
	}
	
	public void printKaki(int jumlahKaki_hewan){
		jumlahKaki = jumlahKaki_hewan;
	}
	
	public void CetakInfo(){
		System.out.println("Nama : "+nama);
		System.out.println("Berat : "+berat);
		System.out.println("Jumlah kaki : "+jumlahKaki);
	}
}