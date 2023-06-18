package ejerciciosInterface.ejercicio1;
/**
 * 
 * @author speedemon
 *
 */
public class Camisa extends Ropa implements ArticuloVenta{
	

	// Atributo propio
	private String shirtType;
		
	// Constructor utilizando los atributos heredados de la clase Ropa
	public Camisa(String size, String color, float price, String supplier, String shirtType) {
	super(size, color, price, supplier); // Atributos heredados
	this.shirtType = shirtType; // Atributo propio de la clase Pantalon
	}
		
	// Metodo Setter & Getter

	public String getShirtType() {
		return shirtType;
	}

	public void setShirtType(String shirtType) {
		this.shirtType = shirtType;
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
	return "Tipo de pantalon: " + shirtType + "Talla: " + super.getSize() + " Color: " + super.getColor() 
			+ " Precio: " + super.getPrice() + " Marca: " + super.getSupplier();
	}
		
	
}
