package LechuCV;

public class Educacion {
	private String anoInicio;
	private String anoFin;
	private String nombreTitulo;
	private String nombreUniver;
	private String descTitulo;
	
	public Educacion() {}
	public Educacion(String anoInicio, String anoFin, String nombreTitulo, String nombreUniver, String descTitulo) {
		super();
		this.anoInicio = anoInicio;
		this.anoFin = anoFin;
		this.nombreTitulo = nombreTitulo;
		this.nombreUniver = nombreUniver;
		this.descTitulo = descTitulo;
	}
	public String getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}
	public String getAnoFin() {
		return anoFin;
	}
	public void setAnoFin(String anoFin) {
		this.anoFin = anoFin;
	}
	public String getNombreTitulo() {
		return nombreTitulo;
	}
	public void setNombreTitulo(String nombreTitulo) {
		this.nombreTitulo = nombreTitulo;
	}
	public String getNombreUniver() {
		return nombreUniver;
	}
	public void setNombreUniver(String nombreUniver) {
		this.nombreUniver = nombreUniver;
	}
	public String getDescTitulo() {
		return descTitulo;
	}
	public void setDescTitulo(String descTitulo) {
		this.descTitulo = descTitulo;
	}
	
	
	
}
