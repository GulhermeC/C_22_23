@SuppressWarnings("CheckReturnValue")
public class Execute extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      double res;
      String a = ctx.Number().getText();
      res = Double.parseDouble(a);
      System.out.println("visitExprNumber: " + res);
      return res;
      //return visitChildren(ctx);
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double o1 = visit(ctx.expr(0));
      System.out.println("n1: " + o1);
      Double o2 = visit(ctx.expr(1));
      System.out.println("n2: " + o2);
      Double res = 0.0;
      switch(ctx.op.getText()){
         case "+":
            res = o1 + o2;
            break;
         
         case "-":
            res = o1 - o2;
            break;
         
         case "*":
            res = o1 * o2;
            break;
         
         case "/":
            res = o1 / o2;
            break;
      }
      
      //return visitChildren(ctx);
      System.out.println("result: " + res);
      return res;
   }
}
