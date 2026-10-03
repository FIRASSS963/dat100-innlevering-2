package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int i=0; i<tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String s = "[";
		for (int i=0; i < tabell.length; i++) {
			s += tabell[i];
			if (i < tabell.length - 1 ) {
				s += ",";
			}
		}
		s += "]";
		return s;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum = 0;
		for ( int i=0; i< tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		for (int i=0; i< tabell.length; i++) {
			if (tabell [i] == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		for (int i=0; i< tabell.length; i++) {
			if (tabell[i]==tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int[] nyTabell = new int[tabell.length];
		for (int i=0; i< tabell.length; i++) {
			nyTabell[i] = tabell[tabell.length-1-i];
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		for (int i=0; i< tabell.length-1; i++) {
			if (tabell [i] > tabell [i+1]) {
					return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int nylengde = tabell1.length+ tabell2.length;
		int[] nytabell = new int[nylengde];
		for (int i=0; i< tabell1.length; i++) {
			nytabell[i] = tabell1[i];
		}
		for (int i=0; i< tabell2.length; i++){
			nytabell[tabell1.length + i]= tabell2[i];
		}
		return nytabell;
	}
}
