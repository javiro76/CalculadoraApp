import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        System.out.println("**** Aplicación Calculadora ****");
        System.out.print("Proporciona valor operando 1:");
        Scanner consola = new Scanner(System.in);
        var operando1 = Integer.parseInt(consola.nextLine().trim());
        System.out.print("Proporciona valor operando 2:");
        var operando2 = Integer.parseInt(consola.nextLine().trim());
        var resultado = operando1 + operando2;
        System.out.println("Resultado: " + resultado);
    }

}
