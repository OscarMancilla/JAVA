import java.util.Scanner;
public class EjercicioEnClase3{
    public static void main(String args[]) throws Exception{

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero ");
        
        int numero = scan.nextInt();
        boolean Primo = true ;

        for(int c = 2 ; c<numero-1; c+=1){
                if (numero % c == 0){
                    Primo = false;
                }
            }

        if (Primo == true){
            System.out.println("el numero es primo");
        }

        else {
            System.out.println("el numero no es primo");
        }
    }
}
