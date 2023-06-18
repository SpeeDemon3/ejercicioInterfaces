package ejerciciosInterface.ejercicio1;
/**
 * 
 * @author speedemon
 *
 */
public class Ropa {

	// Atributos
	
	private String size;
	private String color;
	private float price;
	private String supplier;
	

	// Cosntructor vacio
	public Ropa() {}
	
	// Constructor con todos sus atributos
	public Ropa(String size, String color, float price, String supplier) {
		this.size = size;
		this.color = color;
		this.price = price;
		this.supplier = supplier;
	}
	
	// Setters & Getters
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	// Sobrescritura de motodos equals() y toString()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + supplier.hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Ropa other = (Ropa) obj;
		if (supplier != other.supplier) {
			return false;
		}
		
		return true;
		
	}
	
	@Override
	public String toString() {
		return "[Talla: " + size + " Color: " + color + " Precio: " + price + " Marca: " + supplier + "]";
	}

}
