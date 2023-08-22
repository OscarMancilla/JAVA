import java.util.Scanner;
public class EjercicioEnClase
{
    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int n1 = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = scan.nextInt();
        if (n1=n2) {
            System.out.println("los numeros son iguales");
        }
        else {
            if (n1>n2) {
                System.out.println("el numero " + n1 + "es mayor a " + n2);
            }
            else {
                System.out.println("el numero " + n2 + "es mayor a " + n1);
            }

        }
        scan.close(); 
    }
}