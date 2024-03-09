import java.util.Scanner;

public class Convertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a palavra: ");
        String entrada = sc.nextLine();
        String convertido = stringConvertida(entrada);
        System.out.println("String convertida: " + convertido);
        sc.close();
    }

    public static String stringConvertida(String str) {
        String convertido = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            convertido += str.charAt(i);
        }
        return convertido;
    }
}