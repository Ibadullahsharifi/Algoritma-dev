public class BolunebilirSayilar extends Sayilar{
	public boolean beseBolunur;
	public boolean onbireBolunur;
	private int asalCarpanSayisi;
	
	static void Goster() {
		BolunebilirSayilar obekiHesapla = new BolunebilirSayilar();
		obekiHesapla.Goster();
		System.out.println("Obebin Hesaplan Degerli " + obekiHesapla);
		
	}
	public static boolean MukemmelSayiKontrol(int beseBolunur) {
		beseBolunur = beseBolunur;
		if(beseBolunur % 2 == 0)
			return true;
		else if(beseBolunur % 2 != 0)
			return false;
		return true;
	}
}