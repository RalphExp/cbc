package net.loveruby.cflat.ast;
import net.loveruby.cflat.type.*;

public class SizeofExprNode extends ExprNode {
    protected ExprNode expr;
    protected TypeNode type;

    public SizeofExprNode(ExprNode expr, TypeRef type) {
        this.expr = expr;
        this.type = new TypeNode(type);
    }

    public ExprNode expr() {
        return this.expr;
    }

    public Type type() {
        return this.type.type();
    }

    public TypeNode typeNode() {
        return this.type;
    }

    public Location location() {
        return expr.location();
    }

    protected void _dump(Dumper d) {
        d.printMember("expr", expr);
    }

    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}