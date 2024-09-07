import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    //example from tutorial
    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }
    // example from tutorial
    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    //Test written by me
    @Test
    @DisplayName("Negate a number")
    void makeNegative() {
        int number = 50;
        assertAll(() -> assertEquals(-4, Calculator.MakeNegative(-4)),
                () -> assertEquals(-4, Calculator.MakeNegative(4)),
                () -> assertEquals(0, Calculator.MakeNegative(0)),
                () -> assertEquals(number * -1, Calculator.MakeNegative(number)));
    }

    //test written by me
    @Test
    @DisplayName("adding 17")
    void addseventeen() {
        assertAll(() -> assertEquals(17, Calculator.addseventeen(0)),
                () -> assertEquals(17+17, Calculator.addseventeen(Calculator.addseventeen(0))),
                () -> assertEquals(-30, Calculator.addseventeen(-47)));
    }
}