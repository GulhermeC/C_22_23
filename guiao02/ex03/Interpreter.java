@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(CalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Double res = null;
      Double o1 = visit(ctx.expr(0));
      Double o2 = visit(ctx.expr(1));
      System.out.println("n1: " + o1);
      System.out.println("n2: " + o2);
      switch(ctx.op.getText()){
         case "+":
            res = o1 + o2;
            break;
         case "-":
            res = o1 - o2;
            break;
      }
      //return visitChildren(ctx);
      System.out.println("Result: " + res);
      return res;
   }

   @Override public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Double res = null;
      res = visit(ctx.expr());
      System.out.println("Par: " + res);
      return res;
   }

   @Override public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Double res = null;
      String a = ctx.Integer().getText();
      res = Double.parseDouble(a);
      System.out.println("visitExprInteger: " + res);
      return res;
   }

   @Override public Double visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Double res = null;
      Double o1 = visit(ctx.expr(0));
      Double o2 = visit(ctx.expr(1));
      System.out.println("n1: " + o1);
      System.out.println("n2: " + o2);
      switch(ctx.op.getText()){
         case "*":
            res = o1 * o2;
            break;
         case "/":
            res = o1 / o2;
            break;
         case "%":
            res = o1 % o2;
            break;
      }
      //return visitChildren(ctx);
      System.out.println("Result: " + res);
      return res;
   }
}
