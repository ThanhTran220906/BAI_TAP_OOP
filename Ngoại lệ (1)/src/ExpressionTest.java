public class ExpressionTest {
    /**
     * Expression test.
     */
    public static void main(String[] args) {
        Expression exp1 = new Square(new Numeral(10));
        Expression exp2 = new Multiplication(new Numeral(4), new Numeral(3));
        Expression exp3 = new Subtraction(exp1, new Numeral(3));
        Expression exp4 = new Addition(exp3, exp2);
        Expression exp5 = new Square(exp4);
        System.out.println(exp5.toString());
        System.out.println(exp5.evaluate());
    }
}
