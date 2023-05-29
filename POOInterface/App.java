package POOInterface;

/**
 * App
 */
public class App { 
    public static void Main(String[] args){
        Quadrado figura1 = new Quadrado(7);

        System.out.println("Nome figura é "+ figura1.getNomeFigura()+"/n Area = "+figura1.getArea()+"/n Perimetro = "+figura1.getPerimetro());
        
        Retangulo figura2 = new Retangulo(4, 8);
        
        System.out.println("Nome figura é "+ figura2.getNomeFigura()+"/n Area = "+figura2.getArea()+"/n Perimetro = "+figura2.getPerimetro());
        
        Trapezio figura3 = new Trapezio(5, 3, 2, 4, 6);
        
        System.out.println("Nome figura é "+ figura3.getNomeFigura()+"/n Area = "+figura3.getArea()+"/n Perimetro = "+figura3.getPerimetro());
    }
}
