// For simple string processing

public class New{
	public static void main(String[] args){
        char[] Name = {'H','A','D','I'};
        System.out.println(Name);

        String Name2 = new String(Name);
        System.out.print(Name2+"\n");
        System.out.print(Name2+"OKE\n");

        String Name3 = "Hamora Hadi";
        System.out.print(Name3+"\n");

        char karakter_pertama = Name3.charAt(0); // Take a char from a string
        System.out.println("Karakter pertama adalah : "+karakter_pertama);

        String Name4 = "Hamora Hadi";
        int panjang_karakter = Name4.length(); // Check a length of the string
        System.out.println("Jumlah karakter pada string Name 4 adalah : "+panjang_karakter);

        String Name5 = Name4.toLowerCase(); // To lower case
        System.out.print(Name5+" Sudah jadi kecil\n");

        String Name6 = Name5.toUpperCase(); // To upper case
        System.out.print(Name6+" Sudah jadi besar");
	}
}