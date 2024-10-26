package uth.uth;

public class Calculator {
	public double calcularAreaCirculo(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularAreaCuadrado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("El lado no puede ser negativo");
        }
        return Math.pow(lado, 2);
    }

    public double calcularAreaRectangulo(double largo, double ancho) {
        if (largo < 0 || ancho < 0) {
            throw new IllegalArgumentException("Las dimensiones no pueden ser negativas");
        }
        return largo * ancho;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("La base y la altura no pueden ser negativas");
        }
        return (base * altura) / 2;
    }
}
