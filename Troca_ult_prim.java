
package treino_vetores;

import java.util.Scanner;


public class Troca_ult_prim {

    //este codigo pega o ultimo valor digitado e o coloca na primeira posi��o do vetor
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n[] = new int[5];
        int aux;
        System.out.println("Insira os valores a serem trocados: ");
        for (int i = 0; i < n.length; i++) {
            n[i]=scan.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n.length/2; i++) {
            aux = n[i];
            n[i]=n[n.length-1-i];
            n[n.length-1-i]=aux;
        }
        System.out.println();
        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d]= %d\n",i,n[i]);
        }
    }
    
}
