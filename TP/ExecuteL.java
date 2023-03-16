import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
@SuppressWarnings("CheckReturnValue")

public class ExecuteL extends ShapesBaseListener {

   @Override public void enterMain(ShapesParser.MainContext ctx) {
   }

   @Override public void exitMain(ShapesParser.MainContext ctx) {
   }

   @Override public void enterStatExpr(ShapesParser.StatExprContext ctx) {
   }

   @Override public void exitStatExpr(ShapesParser.StatExprContext ctx) {
   }

   @Override public void enterExprAddSub(ShapesParser.ExprAddSubContext ctx) {
   }

   @Override public void exitExprAddSub(ShapesParser.ExprAddSubContext ctx) {
   }

   @Override public void enterExprParent(ShapesParser.ExprParentContext ctx) {
   }

   @Override public void exitExprParent(ShapesParser.ExprParentContext ctx) {
   }

   @Override public void exitExprDistance(ShapesParser.ExprDistanceContext ctx) {
      
   }

   @Override public void exitExprNumber(ShapesParser.ExprNumberContext ctx) {
      ctx.res = Double.parseDouble(ctx.Number().getText());
   }

   @Override public void enterExprMultDiv(ShapesParser.ExprMultDivContext ctx) {
   }

   @Override public void exitExprMultDiv(ShapesParser.ExprMultDivContext ctx) {
      Double res = null;
      Double e1 = ctx.expr(0).res;
      Double e2 = ctx.expr(1).res;
      switch(ctx.op.getText()){
         case "+":
            res = e1 + e2;
            break;
          case "-":
            res = e1 + e2;
            break;
      }   
   
      ctx.res = res;
   
   }


   @Override public void exitDistance(ShapesParser.DistanceContext ctx) {
      double res;
      double p1x = ctx.point(0).x;
      double p1y = ctx.point(0).y;
      double p2x = ctx.point(1).y;
      double p2y = ctx.point(1).y;
   
      res = Math.sqrt((p1x-p2x)*(p1x-p2x) + (p1y-p2y)*(p1y-p2y));
      ctx.res=res;
   }

   @Override public void exitPoint(ShapesParser.PointContext ctx) {
      ctx.x = ctx.expr(0).res;
      ctx.y = ctx.expr(1).res;
   }

   @Override public void exitEveryRule(ParserRuleContext ctx) {
   }

   @Override public void visitTerminal(TerminalNode node) {
   }

   @Override public void visitErrorNode(ErrorNode node) {
   }
}
