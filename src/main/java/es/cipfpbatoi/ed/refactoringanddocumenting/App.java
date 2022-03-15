package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "Bienvenido al Programa" );
        
        Estudiante pepe = new Estudiante(10,"pepe");
        
        String textoEstudiante = "El estudiante ";
        
		imprimirInformacionEstudiante(pepe, textoEstudiante);
        
    }

	private static void imprimirInformacionEstudiante(Estudiante estudiante, String textoEstudiante) {
		if ( Estudiante.isMayorDeEdad (estudiante.edad) ) {
        	System.out.println(textoEstudiante + estudiante.nombre + " es mayor de edad");
        } else {
        	System.out.println(textoEstudiante + estudiante.nombre + " es menor de edad");
        }
	}
}
