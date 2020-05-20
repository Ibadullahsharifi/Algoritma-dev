public class Sayilar {
	public int sayi1;
	public int sayi2;
	public int obeb;
	public int okeb;
	public static int[] asalCarpanlar;
	private boolean aralarindaAsal;
	
	Sayilar(int deger1, int deger2){
		sayi1 = deger1;
		sayi2 = deger2;
	}
	private static int[] asalCarpanBul(int[] asalCarpanlar) {
		 asalCarpanlar[0] = asalCarpanlar[0]; 
		 for(int i = 0; i < asalCarpanlar.length; i++) {
			 if(i % 2 == 0)
				 i =i / 2;
			 	for(int j = 3; j <= Math.sqrt(i); j = j + 2) {
			 		i = i / j;
			 	}			
		 }
		 return asalCarpanlar;
	}
	public static boolean aralindaAsa(int m, int n) {
		return true;
		
	}
	public static int obebHesapla(int sayi1, int sayi2) {
		sayi1 = sayi1;
		sayi2 = sayi2;
		if(sayi1 == 0 || sayi2 == 0)
			return 0;		
		if(sayi1 == sayi2)
			return sayi1;
		if(sayi1 > sayi2)
			return obebHesapla(sayi1-sayi2, sayi2);
		else
			return obebHesapla(sayi1, sayi2-sayi1);
	}
	public int obebHesapla(int sayi1, int sayi2, int obeb) {
		sayi1 = sayi1;
		sayi2 = sayi2;
		obeb = obeb;
		if(sayi1 == 0 || sayi2 == 0 || obeb == 0)
			return 0;
		if(sayi1 == sayi2)
			return sayi1;
		if(sayi1 == obeb)
			return sayi1;
		if(sayi1 > obeb)
			return obebHesapla(sayi1 - obeb, obeb);
		if(sayi1 > sayi2)
			return obebHesapla(sayi1-sayi2, sayi2);
		else
			return obebHesapla(sayi1, sayi2-sayi1);
	}
	public static void main(String[] args) {
		
		Sayilar Yapici = new Sayilar(4, 5);
		
		Sayilar obebHesap = new Sayilar(12, 4);
		obebHesap.obebHesapla(12, 32);
		System.out.println("Obeb Soncu:" + obebHesap);
		
		obebHesap.obebHesapla(10, 15, 33);
		System.out.println("obebin Sonucu:" + obebHesap);
		
		Sayilar AsalCarpanlariBul = new Sayilar([23]);
		AsalCarpanlariBul.asalCarpanBul([33]);
		
	}
}