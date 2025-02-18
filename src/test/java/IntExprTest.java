import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class IntExprTest {

    @ParameterizedTest
    @CsvSource({
        "testcases/input1.txt, testcases/expected-output1.txt",
        "testcases/input2.txt, testcases/expected-output2.txt"
    })   
    public void testOnDefaultInput(String in, String out) throws IOException, URISyntaxException {
        Path inputPath = Paths.get(ClassLoader.getSystemResource(in).toURI());
        Path outputPath = Paths.get(ClassLoader.getSystemResource(out).toURI());
        CharStream input = CharStreams.fromFileName(inputPath.toString());
        IntExprLexer lexer = new IntExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IntExprParser parser = new IntExprParser(tokens);
        ParseTree tree = parser.ini(); // parse; start at prog
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
        int[] result = eval.getResult();
        String expecteOuput = Files.readString(Paths.get(outputPath.toString()));
        assertEquals(Arrays.toString(result), expecteOuput);
    }

    
}