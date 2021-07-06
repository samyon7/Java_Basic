public class Main{
	public static void main(String[] args){
		Hewan hewan = new Hewan();
		
		System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));
		
		System.out.println("--------------------");

        Kucing kucing = new Kucing(); //PEMANGGILAN contructor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));
		
		hewan.makan();
		kucing.makan();
		kucing.makan("Tikus");
		
		System.out.println("------------------------");

        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());
        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));
		
		System.out.println("------------------------");
		
		Object o = new Kucing(); // kucing adalah Object
        Hewan h = new Kucing(); // kucing adalah Hewan
        Kucing k = new Kucing(); // kucing adalah Kucing, pastinya :)
		
		h.makan();
		k.makan();
		
		Object object = k;
		Hewan hewanK = k;
		hewanK.makan();
		
		Kucing kucingK = (Kucing) h;
		kucingK.makan();
		
		Hewan harimau = new Hewan();
		Kucing anggora = (Kucing) harimau;
	}
}