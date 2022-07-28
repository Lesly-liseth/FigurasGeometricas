public class Rectangulo extends FigurasGeometricas{

    private double base;
    private double altura;

    public Rectangulo(double perimetro, double area, double base, double altura) {
        super(perimetro, area);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double  obtenerPerimetro(){
        setPerimetro((2*getAltura())+(2*getBase()));
        return getPerimetro();
    }

    public double obtenerArea(){
        setArea(getBase()*getAltura());
        return getArea();
    }
}
