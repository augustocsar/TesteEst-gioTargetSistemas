package questoes;

import java.util.ArrayList;
import java.util.List;

public class questao3 {
    public static void executar() {
        // Simulando dados de faturamento diário
        List<Double> faturamentoDiario = new ArrayList<>();
        faturamentoDiario.add(1000.0);
        faturamentoDiario.add(1500.0);
        faturamentoDiario.add(2000.0);
        faturamentoDiario.add(0.0);  // Dia sem faturamento
        faturamentoDiario.add(3000.0);
        
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;
        
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }
        
        double mediaMensal = somaFaturamento / diasComFaturamento;
        int diasAcimaDaMedia = 0;
        
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        
        System.out.println("Menor faturamento: R$" + menorFaturamento);
        System.out.println("Maior faturamento: R$" + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}