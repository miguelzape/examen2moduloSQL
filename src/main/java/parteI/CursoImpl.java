package parteI;

public class CursoImpl implements Curso {
	
	private String nombreCurso;
	private String codigo;
	private long cupoMaximo;
    private long alumnosInscritos;
    
   
    // constructor
	public CursoImpl(String nombreCurso, String codigo, long cupoMaximo) {
		super();
		this.nombreCurso = nombreCurso;
		this.codigo = codigo;
		this.cupoMaximo = cupoMaximo;
		this.alumnosInscritos=0;
	}
	
	
	
	@Override
	public String getNombreCurso() {
		return nombreCurso;
	}

	@Override
	public String getcodigo() {
		return codigo;
	}

	@Override
	public long getCupoDisponible() {
		
		return cupoMaximo-alumnosInscritos;
	}
	
	// metodos get y set
	
	public long getAlumnosInscritos() {
		return alumnosInscritos;
	}
	
	public void setAlumnosInscritos(long alumnosInscritos) {
		this.alumnosInscritos = alumnosInscritos;
	}

	public long getCupoMaximo() {
		return cupoMaximo;
	}


	//metodo toString
	@Override
	public String toString() {
		return "CursoImpl [nombreCurso=" + nombreCurso + ", codigo=" + codigo + ", cupoDisponible=" + (cupoMaximo-alumnosInscritos);
	}
	

	
	

}
