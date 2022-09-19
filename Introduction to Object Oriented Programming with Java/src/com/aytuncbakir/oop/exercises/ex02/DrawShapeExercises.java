package com.aytuncbakir.oop.exercises.ex02;

public class DrawShapeExercises {

	public static void main(String[] args) {
		String kolmio = luoKolmio('@', 8);
		System.out.println(kolmio);

		String puu = luoPuu(9, '@', '|');
		System.out.println(puu);

		String puu1 = luoPuu2(9, '$', '/');
		System.out.println(puu1);
	}

	public static String luoKolmio(char ch, int pituus) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 1; i <= pituus; i++) {
			for (int j = 1; j <= i; j++) {
				sb.append(ch);
			}
			sb.append('\n');
		}
		return sb.toString();
	}

	public static String luoPuu(int pituus, char puu, char runko) {
		StringBuilder sb = new StringBuilder("");
		int n = (pituus + 1) / 2;
		for (int i = 1, j = 0; i <= (n + 1) * (pituus + 1); i++) {
			if (i > n * (pituus + 1)) {
				if (i < n * (pituus + 1) + n - 1 || i > n * (pituus + 1) + n + 1)
					sb.append(' ');
				else
					sb.append(runko);
			}else{
				if (i < ((j + 1) * pituus - n + 1) || i > ((j + 1) * pituus - n + 1) + (2 * j))
					sb.append(' ');
				else
					sb.append(puu);
			}

			if (i == ((j + 1) * (pituus + 1)))
				sb.append('\n');

			if (i % (pituus + 1) == 0)
				j++;
		}
		return sb.toString();
	}

	public static String luoPuu2(int pituus, char puu, char runko) {
		StringBuilder sb = new StringBuilder("");
		int n = (pituus + 1) / 2;
		for (int i = 0; i <= n; i++) {
			sb.append(luoRiivi(pituus, puu, runko, n, i));
		}
		return sb.toString();
	}

	public static String luoRiivi(int pituus, char puu, char runko, int n, int riivi) {

		StringBuilder sb = new StringBuilder("");
		char koristus = '¤';
		for (int i = 0; i < pituus; i++) {
			if (riivi == n) {
				if (i < n - 1 || i > n + 1)
					sb.append(' ');
				else
					sb.append(runko);
			}else{
				if (i < pituus - n - riivi + 1 || i > pituus - n + riivi + 1)
					sb.append(' ');
				else{
					if (i % 2 == 1)
						sb.append(puu);
					else
						sb.append(koristus);
				}
			}

		}
		if (riivi == n - 1)
			sb.append(puu);
		sb.append('\n');
		// Console.WriteLine(sb.ToString());
		return sb.toString();
	}

}
