import java.util.HashMap;
import java.util.ArrayList;
@SuppressWarnings("CheckReturnValue")
public class Translator extends CalculatorBaseVisitor<Double> {

   static HashMap<String, Double> variables = new HashMap<String, Double>();
   static ArrayList<String> members = new ArrayList<String>();
   @Override public Double visitProgram(CalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      Double res = visitChildren(ctx);
      for(int i = 0; i < members.size(); i++) {   
         System.out.print(members.get(i) + " ");
     }
     System.out.println(" ");  
      return null;
   }

   @Override public Double visitExprVar(CalculatorParser.ExprVarContext ctx) {
      Double res = null;
      String var = ctx.ID().getText();
      res = variables.get(var);
      System.out.println("Value of Var: " + res);
      return res;
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
      members.add(Double.toString(o1));
      members.add(Double.toString(o2));
      members.add(ctx.op.getText());
      System.out.println("Result: " + res);
      return res;
   }

   @Override public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Double res = null;
      res = visit(ctx.expr());
      System.out.println("Par: " + res);
      return res;
   }

   @Override public Double visitExprAssign(CalculatorParser.ExprAssignContext ctx) {
      Double res = null;
      try{
         String var = ctx.ID().getText();
         Double o1 = visit(ctx.expr());
         System.out.println("variable = " + var);
         System.out.println("number = " + o1);
         variables.put(var, o1);
         System.out.println("Var added to Map");
      }catch (Exception a){
         System.out.println("Error!");
      }
      return res;
      //return res;
   }

   @Override public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Double res = null;
      String a = ctx.Integer().getText();
      res = Double.parseDouble(a);
      System.out.println("visitExprInteger: " + res);
      return res;
   }

   @Override public Double visitExprReduce(CalculatorParser.ExprReduceContext ctx) {
      Double res = null;
      Double o1 = visit(ctx.expr(0));
      Double o2 = visit(ctx.expr(1));
      Double d = __gcd(o1, o2);

      o1 = o1 / d;
      o2 = o2 / d;
      members.add(Double.toString(o1));
      members.add(Double.toString(o2));
      System.out.println("Simplify: " + o1 + "/" + o2);
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
      members.add(Double.toString(o1));
      members.add(Double.toString(o2));
      members.add(ctx.op.getText());
      System.out.println("Result: " + res);
      return res;
   }

   static double __gcd(double a, double b)
   {
      if(b == 0)
         return a;
      return __gcd(b,(a % b));
   }
}
