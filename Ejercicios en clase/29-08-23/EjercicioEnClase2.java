import java.util.Scanner;
public class EjercicioEnClase2{
    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero ");
        int año = scan.nextInt();
        if (año == 0){
            System.out.println("el Factorial es 1");
        }
        else if (año<0){
            System.out.println("el Factorial no existe");
        }
        else{
            int NumeroFactorial = 1 ;
            for(int c = año; c>1; c-=1){
                NumeroFactorial *= c;
            }
            System.out.println("el Factorial es : " + NumeroFactorial);
        
        }
    }
}
