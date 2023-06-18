package ejerciciosInterface.ejercicio1;
/**
 * 
 * @author speedemon
 *
 */
public class Main {

	public static void main(String[] args) {

		// Creo diferentes objetos utilizando polimorfismo
		Ropa jeans = new Pantalon("28", "Dark-Blue", 80, "G-Star", "Slim-Fit");

		Ropa shirt = new Camisa("S", "Pink", 30, "Sphera", "Slim");

		Ropa shoes = new Zapatos("40", "Black", 150, "Nike", "Jordan");
		
		System.out.println(jeans);
		System.out.println(shirt);
		System.out.println(shoes);
	}

}
