import java.io.FileInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class test {
    public static void main(String []args) throws Exception {

        String inputFile= "t.expr";
        FileInputStream    is          = new FileInputStream(inputFile);
        ANTLRInputStream   input       = new ANTLRInputStream(is);
        gramLexer          Lexer       = new gramLexer(input);
        CommonTokenStream  tokens      = new CommonTokenStream(Lexer);
        gramParser         parser      = new gramParser(tokens);
        ParseTree         tree        = parser.compilationUnit();
        //ParseTreeWalker parseTreeWalker= new ParseTreeWalker();
        //parseTreeWalker.walk((ParseTreeListener) new replace(),tree);

replace repl = new replace();
repl.visit(tree);

    }
}

