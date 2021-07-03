package dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductoDTO {
	
	@NotBlank
	private String nombre;
	@Min(0)
	private float precio;
	
	public ProductoDTO() {
	}

	public ProductoDTO(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
