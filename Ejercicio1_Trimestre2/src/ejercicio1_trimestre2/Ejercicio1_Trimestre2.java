package ejercicio1_trimestre2;

import java.util.Scanner;

public class Ejercicio1_Trimestre2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen:");
        double i = sc.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        double j = sc.nextDouble();
        double a = j - (i * 0.4);
        double nota = a / 0.6;
        System.out.println("Para tener un "+ i +" en el trimestre necesitas sacar un "+ nota +" en el segundo examen");
    }

}
