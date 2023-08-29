public class EjercicioEnClase1{
    public static void main(String args[]) throws Exception{
        for(int c = 0; c<10; c+=1){
            int a = 10-c;
            if (a%2 == 1){
                System.out.println(c + "  "  + a + " <-");
            }
            else{
                System.out.println(c + "  "  + a);
            }  
        }
    }
}
