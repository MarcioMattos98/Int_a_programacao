
package lista_matriz;

import java.util.Random;


public class Questao3_matriz {

    
    public static void main(String[] args) {
        Random gerador = new Random();
        int matriz[][] = new int [4][4];
        int linha_maior = 0, coluna_maior=0, maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=gerador.nextInt(21);
            }
            
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" - ");
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j]>maior){
                    maior = matriz[i][j];
                    linha_maior = i;
                    coluna_maior = j;
                }
            }
        }
        System.out.println("O maior valor da matriz é: "+ maior +" na posição ["+linha_maior+","+coluna_maior+"]");
        
    }
    
}
