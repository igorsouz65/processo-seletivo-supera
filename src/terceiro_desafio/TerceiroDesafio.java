package terceiro_desafio;

import java.util.Arrays;
import java.util.Scanner;

public class TerceiroDesafio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int contador = 0;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((arr[j] - arr[i]) == k){
                    contador++;
                }
            }
        }

        System.out.println(contador);


    }

}