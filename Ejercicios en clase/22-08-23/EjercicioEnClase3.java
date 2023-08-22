import java.util.Scanner;
public class EjercicioEnClase3
{
    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println("el numero es par");
        }
        else {
            System.out.println("el numero es impar"); 
        }
        scan.close(); 
    }
}
