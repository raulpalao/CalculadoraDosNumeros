import java.util.Scanner;

public class MultiplicaNumeros
{
    public static void main( String[] args )
    {
        int n1, n2, Multiplica;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        Multiplica = n1 * n2;

        System.out.println( "La mulplicacion de " + n1 + " por " + n2 + " es " + Multiplica + "." );
    }
}
