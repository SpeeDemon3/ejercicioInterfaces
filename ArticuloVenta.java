package ejerciciosInterface.ejercicio1;
/**
 * 
 * @author speedemon
 * 
 * Creamos la interfaz ArticuloVenta con los siguientes métodos:
 * 
 * getPrecio() : float
 * getProveedor() : String
 * 
 * Creamos la clase Ropa con las propiedades y métodos que preciséis.
 * 
 * Creamos la clase Pantalón, Camisa, Zapatos, …etc. heredando de la clase Ropa e implementando la interfaz ArticuloVenta.
 * 
 * Aprovechar a repasar lo visto, sobreescritura de métodos, adaptación de los métodos de la clase Object: equals() y toString(). 
 * 
 * En una clase principal crearemos distintos objetos y mostraremos toda la información que se estime oportuna utilizando 
 * polimorfismo.
 * 
 *
 */
public interface ArticuloVenta {

	// Declaro los metodos que tendran que implementar las clases que implementen la interface
	
	float getPrecio();
	
	String getProvedor();
	
	
}
