import java.util.Scanner;
public class EjercicioEnClase4
{
    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int año = scan.nextInt();
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
            System.out.println("El año es bisiesto");
        }
        else {
            System.out.println("El año no es bisiesto"); 
        }
        
        scan.close(); 
    }
}
