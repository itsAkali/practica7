package LechuCV;

public class Habilidad {
	private String nombreHabilidad;
	private String porHabilidad;
	
	public Habilidad() {}
	public Habilidad(String nombreHabilidad, String porHabilidad) {
		super();
		this.nombreHabilidad = nombreHabilidad;
		this.porHabilidad = porHabilidad;
	}
	
	public String getNombreHabilidad() {
		return nombreHabilidad;
	}
	public void setNombreHabilidad(String nombreHabilidad) {
		this.nombreHabilidad = nombreHabilidad;
	}
	public String getPorHabilidad() {
		return porHabilidad;
	}
	public void setPorHabilidad(String porHabilidad) {
		this.porHabilidad = porHabilidad;
	}
}
