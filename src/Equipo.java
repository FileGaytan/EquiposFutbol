
public class Equipo {
	private String nomEquipo;
	private int puntos;
	
	public Equipo() {
		
	}
	
	public Equipo(String nomEquipo, int puntos) {
		this.nomEquipo = nomEquipo;
		this.puntos = puntos;
	}
	
	public String getNomEquipo() {
		return nomEquipo;
	}
	public void setNomEquipo(String nomEquipo) {
		this.nomEquipo = nomEquipo;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	@Override
	public String toString() {
		return  nomEquipo + " " + " \t  " + puntos;
	}
	

}
