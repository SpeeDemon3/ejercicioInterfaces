package ejerciciosInterface.ejercicio1;

import java.time.LocalDate;

/**
 * 
 * @author speedemon
 *
 * EJERCICIO 2
 * 
 * Vamos a ampliar el ejercicio anterior creando otra interfaz ArticuloPeredecero con el método: caducar()
 * 
 * Podemos crear otras clases Pan, Leche, …etc.
 * 
 * Tiene sentido crear dichas clases implementando ambas interfaces(ArticuloVenta y ArticuloPeredecero)
 * 
 */
public interface ArticuloPeredecero {

	// Declaro el metodo que tendran que implementar las clases que implementen la interface
	boolean caducar(LocalDate date);
	
}
