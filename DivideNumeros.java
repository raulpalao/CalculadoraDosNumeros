import java.util.Scanner;

public class DivideNumeros
{
    public static void main( String[] args )
    {
        int n1, n2, division;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca dividendo: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca divisor: " );
        n2 = teclado.nextInt();

        division = n1 * n2;

        System.out.println( "La división de " + n1 + " entre " + n2 + " es " + division + "." );
    }
}
