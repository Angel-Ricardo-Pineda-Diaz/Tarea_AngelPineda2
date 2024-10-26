package uth.uth;

/*ANGEL RICARDO PINEDA DIAZ 202010050094*/

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();
        int opcion;

        System.out.println("Seleccione una operación:");
		System.out.println("1. Calcular área del círculo");
		System.out.println("2. Calcular área del cuadrado");
		System.out.println("3. Calcular área del rectángulo");
		System.out.println("4. Calcular área del triángulo");
		System.out.println("5. Salir");
		opcion = scanner.nextInt();

		switch (opcion) {
		    case 1:
		        System.out.println("Ingrese el radio:");
		        double radio = scanner.nextDouble();
		        System.out.println("Área del círculo: " + calc.calcularAreaCirculo(radio));
		        break;
		    case 2:
		        System.out.println("Ingrese el lado:");
		        double lado = scanner.nextDouble();
		        System.out.println("Área del cuadrado: " + calc.calcularAreaCuadrado(lado));
		        break;
		    case 3:
		        System.out.println("Ingrese el largo y ancho:");
		        double largo = scanner.nextDouble();
		        double ancho = scanner.nextDouble();
		        System.out.println("Área del rectángulo: " + calc.calcularAreaRectangulo(largo, ancho));
		        break;
		    case 4:
		        System.out.println("Ingrese la base y la altura:");
		        double base = scanner.nextDouble();
		        double altura = scanner.nextDouble();
		        System.out.println("Área del triángulo: " + calc.calcularAreaTriangulo(base, altura));
		        break;
		    case 5:
		        System.out.println("Saliendo...");
		        break;
		    default:
		        System.out.println("Opción no válida");
		}
    }
}

