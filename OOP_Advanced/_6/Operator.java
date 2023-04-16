package Develhope_Exercise.OOP_Advanced._6;

public enum Operator {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public static void Operator (Double num1, Double num2, Operator operator) {
        switch (operator) {
            case ADD -> System.out.println(num1 + num2);
            case SUBTRACT -> System.out.println(num1 - num2);
            case MULTIPLY -> System.out.println(num1 * num2);
            case DIVIDE -> System.out.println(num1 / num2);
        }
    }
}
