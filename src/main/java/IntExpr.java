public class IntExpr {

    private int value;

    public IntExpr(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static IntExpr add(IntExpr left, IntExpr right) {
        //TODO: Provide this method with a correct implementation
        //return new IntExpr(left.getValue() + right.getValue());
        throw new UnsupportedOperationException();
    }

    public static IntExpr mult(IntExpr left, IntExpr right) {
        // TODO: Provide this method with a correct implementation
        //return new IntExpr(left.getValue() * right.getValue());
        throw new UnsupportedOperationException();
    }

    public static IntExpr sub(IntExpr left, IntExpr right) {
        // TODO: Provide this method with a correct implementation
        //return new IntExpr(left.getValue() - right.getValue());
        throw new UnsupportedOperationException();
    }

    public static IntExpr div(IntExpr left, IntExpr right) {
        // TODO: Provide this method with a correct implementation
        //return new IntExpr(left.getValue() / right.getValue());
        throw new UnsupportedOperationException();
    }

}
