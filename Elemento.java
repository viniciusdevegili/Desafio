import java.util.Scanner;

public class Elemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha qual letra você quer executar: ");
        String input = sc.nextLine().toUpperCase();
        System.out.println();

        switch (input) {
            case "A":
                letraA();
                break;
            case "B":
                letraB();
                break;
            case "C":
                letraC();
                break;
            case "D":
                letraD();
                break;
            case "E":
                letraE();
                break;
            case "F":
                letraF();
                break;
            default:
                System.out.println("Letra não é válida");
        }
        sc.close();
    }

    public static void letraA() {
        int num = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println(num);
            num += 2;
        }
    }

    public static void letraB() {
        int num = 1;

        while (num <= 128) {
            System.out.println(num);
            num = num * 2;
        }
    }

    public static void letraC() {
        for (int i = 0; i < 8; i++) {
            int quadrado = i * i;
            System.out.println(quadrado);
        }
    }

    public static void letraD() {
        for (int i = 2; i <= 10; i += 2) {
            int valor = i * i;
            System.out.println(valor);
        }
    }

    public static void letraE() {
        int n1 = 0, n2 = 1, n3 = 0;

        for (int i = 2; i < 8; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void letraF() {
        int[] sequencia = { 2, 10, 12, 16, 17, 18, 19 };
        for (int i = 0; i < sequencia.length; i++) {
            System.out.println(sequencia[i]);
        }
        int proxNumero = sequencia[sequencia.length - 1] + 1;
        System.out.println(proxNumero);
    }
}
