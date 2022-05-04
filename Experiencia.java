package LechuCV;

public class Experiencia {
	private String anoInicio;
	private String anoFin;
	private String nombreEmpresa;
	private String descPuesto;
	
	
	public Experiencia() {}
	public Experiencia(String anoInicio, String anoFin, String nombreEmpresa, String descPuesto) {
		super();
		this.anoInicio = anoInicio;
		this.anoFin = anoFin;
		this.nombreEmpresa = nombreEmpresa;
		this.descPuesto = descPuesto;
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
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getDescPuesto() {
		return descPuesto;
	}
	public void setDescPuesto(String descPuesto) {
		this.descPuesto = descPuesto;
	}
}
