
package uth.uth;

public class AreaCalculator {

    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}

