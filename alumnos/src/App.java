import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
        String name;
        int notas[] = new int[5];

        
        System.out.println("Nombre: ");
        name = scan.nextLine();
        System.out.println("Agregar Calificaciones\n");
        System.out.println("Calificacion 1: ");
        notas[0] = scan.nextInt();
        System.out.println("Calificacion 2: ");
        notas[1] = scan.nextInt();
        System.out.println("Calificacion 3: ");
        notas[2] = scan.nextInt();
        System.out.println("Calificacion 4: ");
        notas[3] = scan.nextInt();
        System.out.println("Calificacion 5: ");
        notas[4] = scan.nextInt();
        
        Metodos m = new Metodos();       
        
        float prom = m.avg(notas);
        char cal = m.calificacion(prom);
        m.printData(name,notas,prom, cal);
    }
    
}

