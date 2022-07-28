public class Cuadrado extends FigurasGeometricas{
    private double lado;

    public Cuadrado(double perimetro, double area, double lado) {
        super(perimetro, area);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double  obtenerPerimetro(){
        setPerimetro(4*getLado());
        return getPerimetro();
    }

    public double obtenerArea(){
        setArea(getLado()*getLado());
        return getArea();
    }
}
