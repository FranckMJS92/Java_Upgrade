package entornos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyCalculatorTest {

    // Al estar usando junit, que no está instalado, te saldrán varios errores.
    // Tú no te preocupes: lo importante es crear los tests con los assets
    // adecuados.
    // De todas formas, os he preparado un archivo para que podáis ejecutar los
    // tests (si queréis).
    // Arrastrad el .jar a la carpeta "lib". Luego, pulsad F1 y escribid "Developer:
    // Reload Window"

    MyCalculator calculator = new MyCalculator();

    // Test para el metodo *add* de la clase MyCalculator
    @Test
    public void testSumaPositivos() {
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    public void testSumaNegativos() {
        assertEquals(-10, calculator.add(-7, -3));
    }

    @Test
    public void testSumaNegativoPositivo() {
        assertEquals(-4, calculator.add(-7, 3));
    }

    @Test
    public void testSumaCeros() {
        assertEquals(0, calculator.add(0, 0));
    }

    // Test para el metodo *divide* de la clase MyCalculator
    @Test
    public void testDividePositivos() {
        assertEquals(4, calculator.divide(20, 5));
    }

    @Test
    public void testDivideNegativos() {
        assertEquals(4, calculator.divide(-20, -5));
    }

    @Test
    public void testDivideNegativoPositivo() {
        assertEquals(-4, calculator.divide(-20, 5));
    }

    @Test
    public void testDivideThrow() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(20, 0), "División por cero");
    }

}
