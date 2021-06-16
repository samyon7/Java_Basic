public class Main{
	public static void main(String[] args){
		// Just if
		boolean isOn = true;
		if (isOn){
			System.out.println("Menyalakan lampu");
		}
		
		// If then Else
		boolean isOn_2 = false;
		if (isOn_2){
			System.out.println("Menyalakan lampu");
		}
		else{
			System.out.println("Lampu mati");
		}
		
		// If then Elseif then Else
		int a = 80;
		char indeksPrestasi;
		
		if(a >= 90){
			indeksPrestasi = 'A';
		}
		else if(a >= 80){
			indeksPrestasi = 'B';
		}
		else if(a >= 70){
			indeksPrestasi = 'C';
		}
		else if(a >= 60){
			indeksPrestasi = 'D';
		}
		else if(a >= 50){
			indeksPrestasi = 'E';
		}
		else{
			indeksPrestasi = 'F';
		}
		
		System.out.println("Nilai ujian akhir anda berada di indeks : "+indeksPrestasi);
	}
}