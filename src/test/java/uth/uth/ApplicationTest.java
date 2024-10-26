package uth.uth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    AreaCalculator calculator = new AreaCalculator();

    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(Math.PI * 3 * 3, calculator.calcularAreaCirculo(3), 0.001);
        assertEquals(Math.PI * 0 * 0, calculator.calcularAreaCirculo(0), 0.001);
        assertEquals(Math.PI * 5 * 5, calculator.calcularAreaCirculo(5), 0.001);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(9, calculator.calcularAreaCuadrado(3));
        assertEquals(0, calculator.calcularAreaCuadrado(0));
        assertEquals(25, calculator.calcularAreaCuadrado(5));
    }

    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(6, calculator.calcularAreaRectangulo(2, 3));
        assertEquals(0, calculator.calcularAreaRectangulo(0, 5));
        assertEquals(50, calculator.calcularAreaRectangulo(5, 10));
    }

    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(3, calculator.calcularAreaTriangulo(2, 3));
        assertEquals(0, calculator.calcularAreaTriangulo(0, 5));
        assertEquals(25, calculator.calcularAreaTriangulo(5, 10));
    }
}
