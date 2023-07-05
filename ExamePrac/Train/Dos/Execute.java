import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class Execute extends NumLangBaseVisitor<String> {

   Map<String, String> Variables = new HashMap<String, String>();
   @Override public String visitProgram(NumLangParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(NumLangParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatDisplay(NumLangParser.StatDisplayContext ctx) {
      String res = null;
      String cont = visit(ctx.expr());
      System.out.println(cont);
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatAsig(NumLangParser.StatAsigContext ctx) {
      String res = null;
      String var = ctx.VAR().getText();
      String cont = visit(ctx.expr());
      Variables.put(var, cont);
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprFrac(NumLangParser.ExprFracContext ctx) {
      String res = null;
      res = ctx.FRAC().getText();
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprVar(NumLangParser.ExprVarContext ctx) {
      String res = null;
      String var = ctx.VAR().getText();
      res = Variables.get(var);
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprMult(NumLangParser.ExprMultContext ctx) {
      String res = null;
      String var1 = visit(ctx.expr(0));
      String var2 = visit(ctx.expr(1));

      String[] num1 = var1.split("/");
      String[] num2 = var2.split("/");

      int number1 = Integer.parseInt(num1[0]);
      int den1 = Integer.parseInt(num1[1]);

      int number2 = Integer.parseInt(num2[0]);
      int den2 = Integer.parseInt(num2[1]);

      int res1 = number1 * number2;
      int res2 = den1 * den2;

      res = Integer.toString(res1) + "/" + Integer.toString(res2);

      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprInt(NumLangParser.ExprIntContext ctx) {
      String res = null;
      res = ctx.INT().getText();
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprNeg(NumLangParser.ExprNegContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprSub(NumLangParser.ExprSubContext ctx) {
      String res = null;
      String var1 = visit(ctx.expr(0));
      String var2 = visit(ctx.expr(1));

      String[] num1 = var1.split("/");
      String[] num2 = var2.split("/");

      int number1 = Integer.parseInt(num1[0]);
      int den1 = Integer.parseInt(num1[1]);

      int number2 = Integer.parseInt(num2[0]);
      int den2 = Integer.parseInt(num2[1]);

      int res1 = (number1 * den2) - (number2 * den1);
      int res2 = den1 * den2;

      res = Integer.toString(res1) + "/" + Integer.toString(res2);

      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprPos(NumLangParser.ExprPosContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprPar(NumLangParser.ExprParContext ctx) {
      String res = null;
      res = visit(ctx.expr());
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprAdd(NumLangParser.ExprAddContext ctx) {
      String res = null;
      String var1 = visit(ctx.expr(0));
      String var2 = visit(ctx.expr(1));

      String[] num1 = var1.split("/");
      String[] num2 = var2.split("/");

      int number1 = Integer.parseInt(num1[0]);
      int den1 = Integer.parseInt(num1[1]);

      int number2 = Integer.parseInt(num2[0]);
      int den2 = Integer.parseInt(num2[1]);

      int res1 = (number1 * den2) + (number2 * den1);
      int res2 = den1 * den2;

      res = Integer.toString(res1) + "/" + Integer.toString(res2);

      //return visitChildren(ctx);
      return res;
   }
}




/*
 * IF input.contais("/")
 * String op = ctx.op.getText()
 * 
 * 
 */
