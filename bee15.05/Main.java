import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            Integer nCasos = Integer.valueOf(sc.next());
            
            for (Integer i = 0; i < nCasos; i++) {
                String entrada = sc.next();
                Long numeroObjeto = Long.valueOf(entrada);
                
                if (isPrime(numeroObjeto)) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
            }
        }
        sc.close();
    }

    public static boolean isPrime(Long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (Long i = 3L; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}