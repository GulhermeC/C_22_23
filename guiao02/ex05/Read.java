import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
@SuppressWarnings("CheckReturnValue")

public class Read extends SintaxBaseListener {

   @Override public void enterLine(SintaxParser.LineContext ctx) {
   }

   @Override public void exitLine(SintaxParser.LineContext ctx) {
      String s = ctx.ID().getText();
      String n = ctx.Number().getText();
      try{
         File f = new File(s + ".txt");
         Scanner read = new Scanner(f);
         while(read.hasNextLine()) {
            String data = read.nextLine();
            String[] split = data.split(" ");
            if(n.equals(split[0])){
               System.out.println("Number: " + split[2]);
            }
         }
         read.close();
      }catch(FileNotFoundException e){
         System.out.println("File not found!");
      }
   }

   @Override public void enterEveryRule(ParserRuleContext ctx) {
   }

   @Override public void exitEveryRule(ParserRuleContext ctx) {
   }

   @Override public void visitTerminal(TerminalNode node) {
   }

   @Override public void visitErrorNode(ErrorNode node) {
   }
}
