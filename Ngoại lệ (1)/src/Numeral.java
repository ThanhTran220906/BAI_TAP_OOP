public class Numeral extends Expression {
    private double value;

    public Numeral() {
        value = 0;
    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == (long) value) {
            return String.format("%d", (long) value);
        } else {
            return String.format("%s", value);
        }
    }


    @Override
    public double evaluate() {
        return value;
    }
}
