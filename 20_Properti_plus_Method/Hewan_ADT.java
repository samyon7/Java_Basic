class Hewan_ADT{
	double tinggi = 30;
	double berat = 3;
	
	int umur;
	Hewan_ADT(int umur){
		this.umur = umur;
	}
	
	void lari(){
		System.out.println("Berlari");
	}
	
	void jalan(){
		System.out.println("Berjalan");
	}
	
	void cetakInfo(){
		System.out.println("Tinggi : "+tinggi);
		System.out.println("Berat : "+berat);
		System.out.println("Umur : "+umur);
	}
}