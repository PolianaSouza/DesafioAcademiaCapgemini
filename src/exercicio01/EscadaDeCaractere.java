package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class EscadaDeCaractere {
    public static void main(String[] args) {
        int tamanho;
        Scanner scanner = new Scanner(System.in);
        //crio um array para a escada
        ArrayList<String> escada = new ArrayList<String>();
        System.out.println("Digite um número: \n");
        //tamanho é definido pelo usuário
        tamanho = scanner.nextInt();

        int x = 0;
        while(x <= tamanho){
            //Adiciono os elementos da escada de acordo com tamanho definido acima e mando repetir os mesmos.
            escada.add("*".repeat(x+1) + " ".repeat(tamanho-1));
            x++;
        }

        //percorro minha lista de array com for-each
        for(String s: escada){
            System.out.println(s);
        }
    }
}
