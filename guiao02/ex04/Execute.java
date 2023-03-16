@SuppressWarnings("CheckReturnValue")
public class Execute extends PreFixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(PreFixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(PreFixCalculatorParser.StatContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitExprSuffix(PreFixCalculatorParser.ExprSuffixContext ctx) {
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

   @Override public Double visitExprNumber(PreFixCalculatorParser.ExprNumberContext ctx) {
      double res;
      String a = ctx.Number().getText();
      res = Double.parseDouble(a);
      System.out.println("visitExprNumber: " + res);
      return res;
   }
}
