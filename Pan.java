package ejerciciosInterface.ejercicio1;

import java.time.LocalDate;

/**
 * 
 * @author speedemon
 *
 */
public class Pan implements ArticuloVenta, ArticuloPeredecero{

	// Atributos propios
	private String supplier;
	private float price; 
	private LocalDate date = LocalDate.now(); // Fecha actual utilizando un objeto LocalDate
	
	// Constructor con todos sus parametros
	public Pan(String supplier, float price, LocalDate date) {
		this.supplier = supplier;
		this.price = price;
		this.date = date;
	}
	
	// Setter & Getters
	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	// Implemento los metodos de la interface ArticuloVenta
	public float getPrecio() {
		return price;
	}
	
	public String getProvedor() {
		return supplier;
	}

	// Implemento el metodo de la interface ArticuloPeredecero
	@Override
	public boolean caducar(LocalDate date) {  // Año, Mes, Dia
		LocalDate expirationDate =  LocalDate.of(2024, 3, 29); // Fecha donde caducara el alimentos

		if (date == expirationDate) {
			return true;
		} else {
			return false;
		}
	}


}
