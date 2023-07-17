package quarto_desafio;

import java.util.Scanner;

public class QuartoDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String texto;


        for(int i = 0; i < n; i++){
            texto = scanner.nextLine();
            String saida = "";
            for(int j = (texto.length() / 2) - 1; j >= 0; j--){
                saida += String.valueOf(texto.charAt(j));
            }
            for(int k = texto.length() - 1; k > (texto.length() / 2) ; k--){
                saida += String.valueOf(texto.charAt(k));
            }

            System.out.println(saida);

        }


    }

}