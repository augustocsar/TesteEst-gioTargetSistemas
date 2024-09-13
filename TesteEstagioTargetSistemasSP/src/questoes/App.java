package questoes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nEscolha uma questão para executar (1-5) ou 0 para sair:");
                int escolha = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha após nextInt()
                
                switch (escolha) {
                    case 0:
                        System.out.println("Encerrando o programa.");
                        return;
                    case 1:
                        questao1.executar();
                        break;
                    case 2:
                        questao2.executar(scanner);
                        break;
                    case 3:
                        questao3.executar();
                        break;
                    case 4:
                        questao4.executar();
                        break;
                    case 5:
                        questao5.executar(scanner);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
}