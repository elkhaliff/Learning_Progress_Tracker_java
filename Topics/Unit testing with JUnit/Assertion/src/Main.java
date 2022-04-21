
class CalculatorTest {
    void testAddition() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1, calculator.add(1, 0));
    }
}