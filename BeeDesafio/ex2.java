import java.util.HashSet;
import java.util.Scanner;

public class ex2 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 0 && y == 0) break;

            HashSet<Integer> cartas1 = new HashSet<>();
            Objeto.preencher(cartas1, x);
            Objeto c1 = new Objeto(cartas1);

            HashSet<Integer> cartas2 = new HashSet<>();
            Objeto.preencher(cartas2, y);
            Objeto c2 = new Objeto(cartas2);

            int result = Objeto.comparar(c1, c2);
            System.out.println(result);
        }
    }
}

class Objeto {
    private HashSet<Integer> cartas;

    public Objeto(HashSet<Integer> cartas) {
        this.cartas = cartas;
    }

    public static void preencher(HashSet<Integer> set, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            set.add(ex2.sc.nextInt());
        }
    }

    static int comparar(Objeto c1, Objeto c2) {
        HashSet<Integer> somenteC1 = new HashSet<>(c1.getCartas());
        somenteC1.removeAll(c2.getCartas());

        HashSet<Integer> somenteC2 = new HashSet<>(c2.getCartas());
        somenteC2.removeAll(c1.getCartas());

        return Math.min(somenteC1.size(), somenteC2.size());
    }

    public HashSet<Integer> getCartas() {
        return cartas;
    }

    public void setCartas(HashSet<Integer> cartas) {
        this.cartas = cartas;
    }
}