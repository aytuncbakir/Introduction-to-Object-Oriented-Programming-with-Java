package com.aytuncbakir.oop.ch03.primitives.characters;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aÅŸaÄŸÄ±daki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class TurkishCharacters {
	public static void main(String[] args) {
		// ç, ı, ü, ğ, ö, ş, İ, Ğ, Ü, Ö, Ş, Ç 
		int ı = 8;
		int ğ = 3;

		double ş = şunuHesaplaBakalım(ı, ğ);
		System.out.println("Toplam fiyat: " + ş + '\u20BA');
	}

	public static double şunuHesaplaBakalım(int ö, int ü) {
		int ı = ö + ü;
		double j = ö - ü;
		return ı * j;
	}
}
