import java.util.Scanner;

public class Lampada {
    public static void main(String[] args) {
        boolean[] lampadas = new boolean[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o estado inicial das lâmpadas (true para ligado, false para desligado):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Lâmpada " + (i + 1) + ": ");
            lampadas[i] = scanner.nextBoolean();
        }

        boolean[] primeiraIda = verificarLampadas(lampadas);

        boolean[] segundaIda = new boolean[3];
        for (int i = 0; i < 3; i++) {
            segundaIda[i] = !lampadas[i];
        }

        boolean[] resultado = verificarLampadas(segundaIda);

        System.out.println("Resultado:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Interruptor " + (i + 1) + " controla a lâmpada " + (i + 1) + ": " + resultado[i]);
        }
    }

    public static boolean[] verificarLampadas(boolean[] lampadas) {
        boolean[] estadoLampadas = new boolean[3];

        for (int i = 0; i < 3; i++) {
            estadoLampadas[i] = lampadas[i];
        }

        return estadoLampadas;
    }
}