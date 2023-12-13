package parteI;

public class Master extends CursoImpl {
	
	private boolean oficial;

	public Master(String nombreCurso, String codigo, long cupoMaximo, boolean oficial) {
		super(nombreCurso, codigo, cupoMaximo);
		this.oficial = oficial;
	}

	public boolean isOficial() {
		return oficial;
	}
 
}
