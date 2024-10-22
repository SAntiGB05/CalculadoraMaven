package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(8.0, calculadora.suma(5, 3), "La suma debe ser 8");
    }

    @Test
    void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.resta(5, 3), "La resta debe ser 2");
    }
}

