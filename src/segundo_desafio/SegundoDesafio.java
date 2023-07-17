package segundo_desafio;

import java.util.*;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor monetário: ");
        double valor = scanner.nextDouble();

        int valorInteiro = (int) valor;
        int centavos = (int) ((valor - valorInteiro) * 100 + 0.001); // Adicionamos 0.001 para corrigir pequenos erros de arredondamento

        double[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("Notas:");
        for (int i = 0; i < notas.length; i++) {
            int quantidade = valorInteiro / (int) notas[i];
            valorInteiro %= notas[i];
            System.out.println(quantidade + " nota(s) de R$" + String.format("%.2f", notas[i]).replace(",", "."));
        }

        if(valorInteiro == 1){
            centavos += 100;
        }

        System.out.println("Moedas:");
        for (int i = 0; i < moedas.length; i++) {
            int quantidade = centavos / (int) (moedas[i] * 100);
            centavos %= (int) (moedas[i] * 100);
            System.out.println(quantidade + " moeda(s) de R$" + String.format("%.2f", moedas[i]).replace(",", "."));
        }

        scanner.close();
    }
}