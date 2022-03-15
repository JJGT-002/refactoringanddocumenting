package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean isMayorDeEdad(int edad)
	{
		return edad >= 18;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido al Programa" );
        
        Estudiante pepe = new Estudiante(10,"pepe");
        
        if ( isMayorDeEdad (pepe.edad) ) {
        	System.out.println("El estudiante " + pepe.nombre + " es mayor de edad");
        } else {
        	System.out.println("El estudiante " + pepe.nombre + " es menor de edad");
        }
        
    }
}
