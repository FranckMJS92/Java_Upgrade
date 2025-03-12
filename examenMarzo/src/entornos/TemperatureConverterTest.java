package entornos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de tests para la clase TemperatureConverter.
 */
public class TemperatureConverterTest {

    // Al estar usando junit, que no está instalado, te saldrán varios errores.
    // Tú no te preocupes: lo importante es crear los tests con los asserts
    // adecuados.
    // De todas formas, os he preparado un archivo para que podáis ejecutar los
    // tests (si queréis).
    // Arrastrad el .jar a la carpeta "lib". Luego, pulsad F1 y escribid "Developer:
    // Reload Window"

    // Creación de una instancia de la clase TemperatureConverter creada en el otro
    // archivo .java
    private final TemperatureConverter conversor = new TemperatureConverter();

    // Tests para la función celsiusToFahrenheit
    @Test
    void testConCelsiusPositivos() {
        assertEquals(42.44, conversor.celsiusToFahrenheit(5.8));
    }

    @Test
    void testConCelsiusCero() {
        assertEquals(32, conversor.celsiusToFahrenheit(0));
    }

    @Test
    void testConCelsiusNegativos() {
        assertEquals(-148, conversor.celsiusToFahrenheit(-100));
    }

    // Tests para la función fahrenheitToCelsius
    @Test
    void testConFahrenheitPositivos() {
        assertEquals(10, conversor.fahrenheitToCelsius(50));
    }

    @Test
    void testConFahrenheitCero() {
        assertEquals((-32) * 5 / 9.0, conversor.fahrenheitToCelsius(0));
    }

    @Test
    void testConFahrenheitNegativos() {
        assertEquals(-50, conversor.fahrenheitToCelsius(-58));
    }

    // Tests para la función averageCelsius

    @Test
    void testMediaPositivos() {
        assertEquals(25, conversor.averageCelsius(20, 30));
    }

    @Test
    void testMediaNegativos() {
        assertEquals(-10, conversor.averageCelsius(-15, -5));
    }

    @Test
    void testMediaLimites() {
        assertEquals(-273.15, conversor.averageCelsius(-273.15, -273.15));
    }

    @Test
    void testMediaFueraDeRango() {
        assertThrows(IllegalArgumentException.class, () -> conversor.averageCelsius(-300, 0),
                "Temperatura en Celsius por debajo del cero absoluto");
    }
}
