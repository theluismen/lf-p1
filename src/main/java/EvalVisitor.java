    import java.util.List;
    
    
    public class EvalVisitor extends IntExprBaseVisitor<IntExpr>{
    
        private int[] result; 
     
        public int[] getResult() {
            return result;
        }
    
        private int index;
    
        @Override
        public IntExpr visitIni(IntExprParser.IniContext ctx) {
            List<IntExprParser.ExprContext> exprList = ctx.expr();
            result = new int[exprList.size()];
            index = 0;
            for (IntExprParser.ExprContext expr : exprList) {
                result[index++] = visit(expr).getValue();
            }
            return null;
        }
    
        @Override
        public IntExpr visitAddExpr(IntExprParser.AddExprContext ctx) {
            IntExpr left = visit(ctx.expr(0));
            IntExpr right = visit(ctx.expr(1));
            return IntExpr.add(left, right); 
        }
    
        @Override
        public IntExpr visitDivExpr(IntExprParser.DivExprContext ctx) {
            IntExpr left = visit(ctx.expr(0));
            IntExpr right = visit(ctx.expr(1));
            return IntExpr.div(left, right);
        }
    
        @Override
        public IntExpr visitIntExpr(IntExprParser.IntExprContext ctx) {
            return new IntExpr(Integer.parseInt(ctx.INT().getText()));
        }
    
        @Override
        public IntExpr visitMultExpr(IntExprParser.MultExprContext ctx) {
            IntExpr left = visit(ctx.expr(0));
            IntExpr right = visit(ctx.expr(1));
            return IntExpr.mult(left, right);
        }
    
        @Override
        public IntExpr visitParExpr(IntExprParser.ParExprContext ctx) {
            return visit(ctx.expr());
        }
    
        @Override
        public IntExpr visitSubExpr(IntExprParser.SubExprContext ctx) {
            IntExpr left = visit(ctx.expr(0));
            IntExpr right = visit(ctx.expr(1));
            return IntExpr.sub(left, right);
        }
    
    
    }
