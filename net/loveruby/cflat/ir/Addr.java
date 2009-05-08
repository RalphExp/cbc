package net.loveruby.cflat.ir;
import net.loveruby.cflat.asm.Type;

public class Addr extends Expr {
    protected Expr expr;

    public Addr(Type type, Expr expr) {
        super(type);
        this.expr = expr;
    }

    public Expr expr() { return expr; }

    public <S,E> E accept(IRVisitor<S,E> visitor) {
        return visitor.visit(this);
    }

    protected void _dump(Dumper d) {
        d.printMember("expr", expr);
    }
}