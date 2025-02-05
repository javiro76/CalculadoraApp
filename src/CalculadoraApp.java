import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while (true) {
            try {

                System.out.println("**** Aplicación Calculadora ****");
                //Mostramos el menú de opciones
                menu();


                var operacion = Integer.parseInt(consola.nextLine().trim());


                if (operacion >= 1 && operacion <= 4) {

                    ejecutarOperacion(operacion, consola);


                } else if (operacion == 5) {
                    System.out.println("Hasta luego...");
                    break;
                } else {
                    System.out.println("Operación no válida");
                }
                //Se imprimi salto de linea para separar las operaciones
                System.out.println();
            }// fin de try
            catch (Exception e) {
                System.out.println("Ocurrió un error!" + e.getMessage());

            }
        }// fin de while

    }// fin de main

    public static void menu() {
        System.out.println("""
                Selecciona el tipo de operación:
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);
        System.out.print("Opción Seleccionada:");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        double resultado;
        System.out.print("Proporciona valor operando 1:");
        var operando1 = Double.parseDouble(consola.nextLine().trim());
        System.out.print("Proporciona valor operando 2:");
        var operando2 = Double.parseDouble(consola.nextLine().trim());
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
            }
            case 2 -> {
                resultado = operando1 - operando2;
            }
            case 3 -> {
                resultado = operando1 * operando2;
            }
            case 4 -> {
                resultado = operando1 / operando2;
            }
            default -> {
                System.out.println("Operación no válida");
                resultado = 0;
            }

        }
        System.out.println("Resultado: " + resultado);
    }
}
