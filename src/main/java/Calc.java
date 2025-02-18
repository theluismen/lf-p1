import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Calc {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        CharStream input;
        if (inputFile != null) {
            input = CharStreams.fromFileName(inputFile);
        } else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            input = CharStreams.fromReader(reader);
        }
        IntExprLexer lexer = new IntExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IntExprParser parser = new IntExprParser(tokens);
        ParseTree tree = parser.ini(); // parse; start at prog
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
        int[] result = eval.getResult();
        System.out.println(Arrays.toString(result));
    }
}
