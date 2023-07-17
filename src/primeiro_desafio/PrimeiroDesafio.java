package primeiro_desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeiroDesafio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList par = new ArrayList<Integer>();
        ArrayList impar = new ArrayList<Integer>();


        for (int i = 0; i < n; i++){

            int num = scan.nextInt();

            if(num%2 == 0){
                par.add(num);
            } else {
                impar.add(num);
            }
        }

        Collections.sort(par);
        Collections.sort(impar, Collections.reverseOrder());

        for(int i = 0; i < par.size(); i++){
            System.out.println(par.get(i));
        }

        for(int i = 0; i < impar.size(); i++) {
            System.out.println(impar.get(i));
        }

    }



}
