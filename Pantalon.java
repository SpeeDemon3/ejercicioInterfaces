package ejerciciosInterface.ejercicio1;
/**
 * 
 * @author speedemon
 *
 */
public class Pantalon extends Ropa implements ArticuloVenta{

	// Atributo propio
	private String pantsType;
	
	// Constructor utilizando los atributos heredados de la clase Ropa
	public Pantalon(String size, String color, float price, String supplier, String pantsType) {
		super(size, color, price, supplier); // Atributos heredados
		this.pantsType = pantsType; // Atributo propio de la clase Pantalon
	}
	
	// Metodo Setter & Getter

	public String getPantsType() {
		return pantsType;
	}

	public void setPantsType(String pantsType) {
		this.pantsType = pantsType;
	}
	
	// Metodos a implementar de la interface ArticuloVenta
	
	public float getPrecio() {
		return this.getPrice();
	}
	
	public String getProvedor() {
		return this.getSupplier();
	}
	
	// Metodo toString() sobrescrito
	@Override
	public String toString() {
		return "Tipo de pantalon: " + pantsType + "Talla: " + super.getSize() + " Color: " + super.getColor() 
			+ " Precio: " + super.getPrice() + " Marca: " + super.getSupplier();
	}
	
	
}
