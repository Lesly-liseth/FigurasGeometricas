import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int op = 0;
        double altura, base, lado = 0, a = 0, b = 0, h = 0;
        do {
            System.out.println("1.Triangulo");
            System.out.println("2.Cuadrado");
            System.out.println("3.Rectangulo");
            System.out.println("4.Paralelogramo");
            System.out.println("5.Salir");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ïngrese la base:");
                    base = sc.nextDouble();
                    System.out.println("Ingrese la altura");
                    altura = sc.nextDouble();
                    Triangulo uno = new Triangulo(0, 0, base, altura);
                    System.out.println("Perimetro: "+uno.obtenerPerimetro());
                    System.out.println("Area:"+uno.obtenerArea());
                    break;

                case 2:
                    System.out.println("Ïngrese el lado:");
                    lado = sc.nextDouble();
                    Cuadrado dos = new Cuadrado(0,0, lado);
                    System.out.println("Perimetro: "+dos.obtenerPerimetro());
                    System.out.println("Area:"+dos.obtenerArea());
                    break;

                case 3:
                    System.out.println("Ïngrese la base:");
                    base = sc.nextDouble();
                    System.out.println("Ingrese la altura");
                    altura = sc.nextDouble();
                    Rectangulo tres = new Rectangulo(0, 0, base, altura);
                    System.out.println("Perimetro: "+tres.obtenerPerimetro());
                    System.out.println("Area:"+tres.obtenerArea());
                    break;

                case 4:
                    System.out.println("Ïngrese el lado mayor: ");
                    a = sc.nextDouble();
                    System.out.println("Ingrese el lado menor: ");
                    b = sc.nextDouble();
                    System.out.println("Ingrese la altura: ");
                    h = sc.nextDouble();
                    Paralelogramo cuatro = new Paralelogramo(0, 0, a,b,h);
                    System.out.println("Perimetro: "+cuatro.obtenerPerimetro());
                    System.out.println("Area:"+cuatro.obtenerArea());
                    break;
            }

        } while (op != 5);
    }
}
