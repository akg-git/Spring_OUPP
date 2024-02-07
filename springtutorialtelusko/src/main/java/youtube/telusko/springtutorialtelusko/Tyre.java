package youtube.telusko.springtutorialtelusko;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private int tyreId;
	private String size;
	private String vehicle;
	private String brand;
	
	
	

	public Tyre(int tyreId, String size, String vehicle, String brand) {
		super();
		this.tyreId = tyreId;
		this.size = size;
		this.vehicle = vehicle;
		this.brand = brand;
	}

	public int getTyreId() {
		return tyreId;
	}

	public void setTyreId(int tyreId) {
		this.tyreId = tyreId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Tyre [tyreId=" + tyreId + ", size=" + size + ", vehicle=" + vehicle + ", brand=" + brand + "]";
	}

	
	
	
}
