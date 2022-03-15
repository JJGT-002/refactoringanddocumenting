package es.cipfpbatoi.ed.refactoringanddocumenting;

public class Estudiante{
	
	private static final int MAJORIA_DE_EDAD = 18;
	int edad;
	String nombre;
	
	
	public Estudiante(int e, String n) {
		this.edad = e;
		this.nombre = n;
	}

	public int comparaTe( Estudiante e) {
		
		if (this.edad == e.edad){
			return 0;
		} else if (this.edad > e.edad) {
			return 1;
		} else {
			return -1;
		}
	}

	public static boolean isMayorDeEdad(int edad){
		return edad >= MAJORIA_DE_EDAD;
	}
	
}
