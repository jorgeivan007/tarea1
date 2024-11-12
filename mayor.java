import java.util.Scanner;

public class MayorDeTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 0, num2 = 0, num3 = 0;

        System.out.println("Ingrese tres números distintos:");
        
        while (true) {
            try {
                System.out.print("Número 1: ");
                num1 = Double.parseDouble(scanner.nextLine());
                break; // Si se ingresa correctamente, salimos del bucle
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        while (true) {
            try {
                System.out.print("Número 2: ");
                num2 = Double.parseDouble(scanner.nextLine());
                if (num2 == num1) {
                    System.out.println("El segundo número debe ser distinto del primero.");
                } else {
                    break; // Si se ingresa correctamente y es distinto, salimos del bucle
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        while (true) {
            try {
                System.out.print("Número 3: ");
                num3 = Double.parseDouble(scanner.nextLine());
                if (num3 == num1 || num3 == num2) {
                    System.out.println("El tercer número debe ser distinto de los dos primeros.");
                } else {
                    break; // Si se ingresa correctamente y es distinto, salimos del bucle
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        double mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);
        
        scanner.close();
    }
}
