//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Hewan_ADT hewan = new Hewan_ADT(2);
		
		hewan.jalan();
		hewan.lari();
		hewan.cetakInfo();
		System.out.println(hewan.tinggi+hewan.tinggi);
	}
}