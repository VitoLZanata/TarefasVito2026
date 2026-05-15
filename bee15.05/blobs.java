import java.util.Scanner;
public class blobs{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Integer n = sc.nextInt();
        Float c = 0f; //comida
        Integer v = 0; // vezes q pode comer
        for (Integer i = 0; i < n; i++) {
            c = sc.nextFloat();
            while(c>1){
                c = c/2;
                v++;
            }
            System.out.println(v + " dias");
            v = 0;
        }
    }
}
