
import java.util.Scanner;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aDatos= new int[5];
        for (int i = 0; i < aDatos.length; i++) {
            aDatos[i] = (int)(Math.random()*10) + 1;
            System.out.print(aDatos[i] + " ");
        }
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("¿Que número quieres Buscar?");
        int Val = sCaptu.nextInt();
        for (int i = 0; i < aDatos.length; i++) {
            if(Val == aDatos[i])
                System.out.println("El Valor está en la posición " + i);
                //Si queremos detenerlo, usamos la instruccion break
        }
        
        
        
        
    }
    
}
