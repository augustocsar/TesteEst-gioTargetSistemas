package questoes;

import java.util.Scanner;

public class questao2 {
    public static void executar(Scanner scanner) {
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
    
    private static boolean pertenceFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        
        int a = 0, b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        
        return b == num;
    }
}