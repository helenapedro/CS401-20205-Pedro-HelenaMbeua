package labs.lab9.prob2;

public class Evaluator {
    static int eval(Expr e) {
        if (e instanceof Constant(int value))
            return value;
        if (e instanceof Add(Expr left, Expr right))
            return eval(left) + eval(right);
        if (e instanceof Multiply(Expr left, Expr right))
            return eval(left) * eval(right);
        throw new IllegalArgumentException("Unknown Expr type: " + e.getClass());
    }

    public static void main(String[] args) {
        Expr expr = new Multiply(
                new Add(new Constant(2), new Constant(3)),
                new Constant(4)
        );
        System.out.println(eval(expr)); // 20
    }

}
