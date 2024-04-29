package geekbrains_course.oop_course.Seminar7_oop;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        ComplexCalculator calculator = new ComplexCalculator();

        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, -1);

        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber division = calculator.divide(num1, num2);

        logger.log("Sum: " + sum);
        logger.log("Product: " + product);
        logger.log("Division: " + division);
    }
}
