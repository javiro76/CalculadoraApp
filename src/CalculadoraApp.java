import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("**** Aplicación Calculadora ****");
        System.out.println("""
        Selecciona el tipo de operación:
        1. Suma
        2. Resta
        3. Multiplicación
        4. División
        5. Salir
        """);
        System.out.print("Opción Seleccionada:");
        var operacion = Integer.parseInt(consola.nextLine().trim());

        int resultado;

        if( operacion >= 1 && operacion <= 4 ){
            System.out.print("Proporciona valor operando 1:");
            var operando1 = Integer.parseInt(consola.nextLine().trim());
            System.out.print("Proporciona valor operando 2:");
            var operando2 = Integer.parseInt(consola.nextLine().trim());
            switch (operacion){
                case 1 ->{
                    resultado = operando1 + operando2;
                }
                case 2 ->{
                    resultado = operando1 - operando2;
                }
                case 3 ->{
                    resultado = operando1 * operando2;
                }
                case 4 ->{
                    resultado = operando1 / operando2;
                }
                default -> {
                    System.out.println("Operación no válida");
                    resultado = 0;
                }

            }
            System.out.println("Resultado: " + resultado);

        } else if (operacion == 5){
            System.out.println("Hasta luego");
        } else {
            System.out.println("Operación no válida");
        }

    }

}
