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

   @Override public String visitPrintStat(StrLangParser.PrintStatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssigStat(StrLangParser.AssigStatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrintEx(StrLangParser.PrintExContext ctx) {
      String res = null;
      String cont = ctx.pexpr().getText();
      //System.out.println(cont);
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignEx(StrLangParser.AssignExContext ctx) {
      String res = null;
      String var = ctx.VAR().getText();
      //System.out.println("Var" + var);
      String content = visit(ctx.asexpr());
      //System.out.println("Content" + content);
      Variables.put(var, content);
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrintVar(StrLangParser.PrintVarContext ctx) {
      String res = null;
      String var = ctx.VAR().getText();
      res = Variables.get(var);
      if (res == null){
         System.out.println("Error Variable Not Defined");
      }else{
         System.out.println("Variable " + res);  
      }
      //return visitChildren(ctx);
      return res;
   }

   @Override public String visitPrintReplace(StrLangParser.PrintReplaceContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrintStr(StrLangParser.PrintStrContext ctx) {
      String res = null;
      String cont = ctx.STR().getText();
      System.out.println("String: " + cont);
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrintAdd(StrLangParser.PrintAddContext ctx) {
      String res = null;
      String var1 = visit(ctx.pexpr(0));
      String var2 = visit(ctx.pexpr(1));
      res = var1 + var2;
      System.out.println(res);
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssigStr(StrLangParser.AssigStrContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssigPar(StrLangParser.AssigParContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssigAdd(StrLangParser.AssigAddContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssigInput(StrLangParser.AssigInputContext ctx) {
      String res = null;
      Scanner sc = new Scanner(System.in);
      System.out.println("User Input: ");
      String input = sc.nextLine();
      System.out.println("Input Give: " + input);
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssigVar(StrLangParser.AssigVarContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
