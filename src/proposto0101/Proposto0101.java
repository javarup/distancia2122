/*
Crear un programa que permita calcular o soldo dun empregado sabendo o
seu soldo base, cantos anos leva traballando na empresa e canto é o plus por
cada trienio. Os tres datos introduciranse polo teclado.
 */
package proposto0101;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Proposto0101 {

    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        //
        //Scanner utilizará a coma como separador dos decimais, a
        //diferenza dos literais de Java nos que se usa o punto.
        //Se queremos usar o punto en ambos casos podemos utilizar
        //o método useLocale() para forzalo.
        Scanner teclado = new Scanner(System.in).useLocale(Locale.ENGLISH);
        boolean datosCompletos = false;

        System.out.print("Soldo base: ");
        double soldoBase = teclado.nextDouble();
        System.out.print("Anos traballados: ");
        int anosTraballados = teclado.nextInt();
        System.out.print("Plus por trienio: ");
        double plusTrienio = teclado.nextDouble();
        datosCompletos = true;
        System.out.println("Soldo: " + (soldoBase + anosTraballados / 3 * plusTrienio));

    }
}
