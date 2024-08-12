import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();
        String[] palavras = frase.split(" ");
        for (String palavra : palavras){
            if (palavra.length() >= 5){
                for (int j = palavra.length() - 1; j >= 0; j--) {
                    System.out.print(palavra.charAt(j));
                }
            }
            else{
                for (int i = 0; i < palavra.length(); i++) {
                    System.out.print(palavra.charAt(i));
                }
            }
            System.out.print(" ");
        }
    }
}