import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para calcular a sequência de Fibonacci dele: ");
        int numero = sc.nextInt();
        boolean existeSequencia = false;
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int a = 0;

        do {
            try {
                fibonacci.add(fibonacci.get(a - 1) + fibonacci.get(a - 2));
            } catch (Exception e) {
                fibonacci.add(a);
            }
            if (numero == fibonacci.get(a)) {
                existeSequencia = true;
            }
            a++;
        } while (fibonacci.get(a - 1) < numero);

        if (existeSequencia) {
            System.out.println("O número informado pertence a sequência de Fibonnacci");
        } else {
            System.out.println("O número informado não pertence a sequência de Fibonnacci");
        }
    }
}
