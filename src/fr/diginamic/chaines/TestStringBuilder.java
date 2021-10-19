package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

//		METHOD 1
		long start = System.currentTimeMillis();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 1; i <= 100_000; i++) {
			strBuilder.append(i);
		}
		long end = System.currentTimeMillis();

		String res = String.format(" Time StringBuilder: %d milliSecondes", (end - start));
		System.out.println(res);

//		METHOD 2 à éviter
		long startConcat = System.currentTimeMillis();
		String strConcat = null;
		for (int i = 1; i <= 100_000; i++) {
			strConcat += String.valueOf(i);
		}
		long endConcat = System.currentTimeMillis();
		
		res = String.format(" Time concat: %.1f secondes", (float)(endConcat - startConcat)/1000);
		System.out.println(res);
	}

}
