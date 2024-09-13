package questoes;

import java.util.Scanner;

public class questao5 {
    public static void executar(Scanner scanner) {
        System.out.print("Digite uma string para ser invertida: ");
        String original = scanner.nextLine();
        
        String invertida = inverterString(original);
        
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
    
    private static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        
        return new String(caracteres);
    }
}