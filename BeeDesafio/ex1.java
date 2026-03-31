import java.util.LinkedList;
import java.util.Scanner;

public class ex1 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int caso = sc.nextInt();
        for (int z = 1; z <= caso; z++) {
            LinkedList<Integer> listaRef = new LinkedList<Integer>();
            int qtd = sc.nextInt();
            int salto = sc.nextInt();

            Circulo homens = new Circulo(listaRef, salto, qtd);
            homens.preencher(homens.getQtd(), homens.getCirculo());
            homens.suicidio(homens.getSalto(), homens);

            System.out.println("Case " + z + ": " + homens.getCirculo().get(0));
        }
    }
}

class Circulo {
    public LinkedList<Integer> circulo;
    public int salto;
    public int qtd;

    public Circulo(LinkedList<Integer> circulo, int salto, int qtd) {
        this.circulo = circulo;
        this.salto = salto;
        this.qtd = qtd;
    }

    public void suicidio(int salto, Circulo homens) {
            int index = 0;
            LinkedList<Integer> lista = homens.getCirculo();
            
            while (lista.size() > 1) {
                index = (index + salto - 1) % lista.size(); 
                lista.remove(index);
            }
    }

    public LinkedList<Integer> preencher(int qtd, LinkedList<Integer> lista) {
        for (int index = 1; index <= qtd; index++) {
            lista.add(index);
        }
        return lista;
    }

    public LinkedList<Integer> getCirculo() {
        return circulo;
    }

    public void setCirculo(LinkedList<Integer> circulo) {
        this.circulo = circulo;
    }

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}