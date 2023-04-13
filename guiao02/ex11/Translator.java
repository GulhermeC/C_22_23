import java.util.List;
import java.util.ArrayList;
@SuppressWarnings("CheckReturnValue")
public class Translator extends ExprCalculatorBaseVisitor<String> {

   List<String> word = new ArrayList<String>();
   @Override public String visitProgram(ExprCalculatorParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(ExprCalculatorParser.StatContext ctx) {
      String res = visitChildren(ctx);
      System.out.print("Word: ");
      for(int i = 0; i<word.size(); i++){
         System.out.print(word.get(i)+ " ");
      }
      System.out.println(" ");
      return null;
   }

   @Override public String visitExprAddSub(ExprCalculatorParser.ExprAddSubContext ctx) {
      String res = null;
      switch(ctx.op.getText()){
         case "+":
            return visitChildren(ctx);
         case "-":
            break;
      }
      return res;
   }

   @Override public String visitExprWord(ExprCalculatorParser.ExprWordContext ctx) {
      String res = null;
      String s1 = visit(ctx.expr(0));
      String s2 = visit(ctx.expr(1));
      if (s1 != null){
         word.add(s1);
      }
      if (s2 != null){
         word.add(s2);
      }
      return res;
   }

   @Override public String visitExprGroup(ExprCalculatorParser.ExprGroupContext ctx) {
      String res = null;

      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprParent(ExprCalculatorParser.ExprParentContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprInt(ExprCalculatorParser.ExprIntContext ctx) {
      String res = null;
      res = ctx.Integer().getText();
      return res;
   }

   @Override public String visitExprLetr(ExprCalculatorParser.ExprLetrContext ctx) {
      String res = null;
      res = ctx.ID().getText();
      return res;
   }

   @Override public String visitExprComment(ExprCalculatorParser.ExprCommentContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprMultDivMod(ExprCalculatorParser.ExprMultDivModContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
