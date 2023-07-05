import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Execute extends StrLangBaseVisitor<String> {

   Map<String, String> Variables = new HashMap<String, String>();
   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(StrLangParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatPrint(StrLangParser.StatPrintContext ctx) {
      String res = null;
      String content = visit(ctx.expr());
      System.out.println(content);
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatAssign(StrLangParser.StatAssignContext ctx) {
      String res = null;
      String var = ctx.VAR().getText();
      String content = visit(ctx.expr());
      Variables.put(var, content); 
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprVar(StrLangParser.ExprVarContext ctx) {
      String res = null;
      String var = ctx.VAR().getText();
      res = Variables.get(var);
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String res = null;
      res = ctx.STR().getText();
      res = res.substring(1, res.length()-1);
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprSubstitute(StrLangParser.ExprSubstituteContext ctx) {
      String res = null;
      String start = visit(ctx.expr(0));
      String subout = visit(ctx.expr(1));
      String subin = visit(ctx.expr(2));
      res = start.replace(subout, subin);
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
      String res = null;
      Scanner sc = new Scanner(System.in);
      String input = visit(ctx.expr());
      System.out.println(input);
      String in = sc.nextLine();
      res = in;
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprTrim(StrLangParser.ExprTrimContext ctx) {
      String res = null;
      String var = visit(ctx.expr());
      res = var.trim();

      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprPar(StrLangParser.ExprParContext ctx) {
      String res = null;
      res = visit(ctx.expr());
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprAdd(StrLangParser.ExprAddContext ctx) {
      String res = null;
      String var1 = visit(ctx.expr(0));
      String var2 = visit(ctx.expr(1));
      res = var1 + var2;
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitExprMin(StrLangParser.ExprMinContext ctx) {
      String res = null;
      String var1 = visit(ctx.expr(0));
      String var2 = visit(ctx.expr(1));
      res = var1.replace(var2, "");
      //return visitChildren(ctx);
      return res;
   }
}
