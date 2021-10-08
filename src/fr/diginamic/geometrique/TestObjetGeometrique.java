package fr.diginamic.geometrique;

public class TestObjetGeometrique {

	static ObjectGeometrique[] objGeometricGeometrique = new ObjectGeometrique[2];

	public static void main(String[] args) {

		Cercle cercle = new Cercle(5);
		ObjectGeometrique rectangle = new Rectangle(3, 6);

		int tabLength = objGeometricGeometrique.length;

		objGeometricGeometrique[0] = cercle;
		objGeometricGeometrique[1] = rectangle;

		for (int i = 0; i < tabLength; i++) {

			String aff = objGeometricGeometrique[i].toString();
			System.out.println(aff);
		}
	}

}
