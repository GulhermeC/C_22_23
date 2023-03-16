@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      String res = "Ola ";
      String s = ctx.ID(0).getText();
      int i = 1;
      while (i < ctx.ID().size()) {
         res = res + s + " ";
         s = ctx.ID(i).getText();
         i++;
      }
      res = res + s + " ";
      System.out.println(res);
      return res;
      //return res;
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      String res = "Adeus ";
      String s = ctx.ID(0).getText();
      int i = 1;
      while (i < ctx.ID().size()) {
         res = res + s + " ";
         s = ctx.ID(i).getText();
         i++;
      }
      res = res + s + " ";
      System.out.println(res);
      return res;
      //return res;
   }
}
