import AccessModifierProtected.packageA.Kelas_A;

public class Kelas_B extends Kelas_A{
	@Override
	protected void methodC(){
		super.methodC();
		System.out.println("Pemanggilan protected dari package luar");
	}
}