public class Paralelogramo extends FigurasGeometricas{

    private double a;
    private double b;
    private double h;

    public Paralelogramo(double perimetro, double area, double a, double b, double h) {
        super(perimetro, area);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double  obtenerPerimetro(){
        setPerimetro((2*getA())+(2*getB()));
        return getPerimetro();
    }

    public double obtenerArea(){
        setArea(getB()*getH());
        return getArea();
    }
}
