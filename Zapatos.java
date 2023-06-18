package ejerciciosInterface.ejercicio1;
/**
 * 
 * @author speedemon
 *
 */
public class Zapatos extends Ropa implements ArticuloVenta{


	// Atributo propio
	private String shoesType;
		
	// Constructor utilizando los atributos heredados de la clase Ropa
	public Zapatos(String size, String color, float price, String supplier, String shoesType) {
	super(size, color, price, supplier); // Atributos heredados
	this.shoesType = shoesType; // Atributo propio de la clase Pantalon
	}
		
	// Metodo Setter & Getter

	public String getShoesType() {
		return shoesType;
	}

	public void setShoesType(String shirtType) {
		this.shoesType = shirtType;
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
		return "[Tipo de pantalon: " + shoesType + "Talla: " + super.getSize() + " Color: " + super.getColor() 
			+ " Precio: " + super.getPrice() + " Marca: " + super.getSupplier() + "]";
	}
		
	
}
