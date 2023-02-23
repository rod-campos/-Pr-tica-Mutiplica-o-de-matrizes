import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        int b = 2;
        int c = 3;
        int[][] matriz1 = new int[b][c];

        int c2 = 3;
        int m = 2;
        int[][] matriz2 = new int[c2][m];

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Digite os valores da botões por camisas : ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < c2; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Digite os valores de camisas por meses : ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        //imprimir primeira matriz
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz1[i][j] + " Matriz de botões por camisas ");
            }
            System.out.println("");
        }
        //imprimir segunda matriz
        for (int i = 0; i < c2; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz2[i][j] + " Matriz de camisas por meses ");
            }
            System.out.println("");
        }
        System.out.println("");

        if (matriz1[0].length == matriz2.length) {

            int[][] matrizC = new int[b][m];
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < m; j++) {
                    for (int z = 0; z < c2; z++) {
                        matrizC[i][j] += matriz1[i][z] * matriz2[z][j];
                    }
                }
            }
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrizC[i][j] + " ");
                    soma = soma + matrizC[i][j];
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("A soma de tudo é: " + soma);
        } else {
            System.out.println("Não é valido essa multiplicação");
        }
    }
}