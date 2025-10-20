import java.util.Scanner;

public class MultiplicaNumeros
{
    public static void main( String[] args )
    {
        int n1, n2, multiplica;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        multiplica = n1 * n2;

        System.out.println( "La multiplicación de " + n1 + " y " + n2 + " es " + multiplica + "." );
    }
}
