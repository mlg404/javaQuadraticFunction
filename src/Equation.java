public class Equation {
    Double a;
    Double b;
    Double c;
    Double delta;
    Double x1;
    Double x2;

    public Equation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.solve();

    }

    public void solve() {
        this.delta = (this.b * this.b) - (4 * this.a * this.c);
        this.x1 = (-this.b + Math.sqrt(this.delta)) / (2 * this.a);
        this.x2 = (-this.b - Math.sqrt(this.delta)) / (2 * this.a);
    }
}
