package questoes;

import java.util.HashMap;
import java.util.Map;

public class questao4 {
    public static void executar() {
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);
        
        double totalFaturamento = faturamentoPorEstado.values().stream().mapToDouble(Double::doubleValue).sum();
        
        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double faturamento = entry.getValue();
            double percentual = (faturamento / totalFaturamento) * 100;
            
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}