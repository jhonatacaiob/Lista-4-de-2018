import java.util.Arrays;
import java.util.Scanner;
public class questao5{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite um tamanho pro vetor 1: ");
    int q1 = puxe.nextInt();
    String[] vetor1 = new String[q1];

    for (int i = 0; i < q1 ; i++ ) {
      System.out.print("Digite um nome pra posição " + i  + " do vetor 1: ");
      vetor1[i] = puxe.next();
    }

    System.out.print("Digite um tamanho pro vetor 2: ");
    int q2 = puxe.nextInt();
    String[] vetor2 = new String[q2];


    for (int i = 0; i < q2 ; i++ ) {
      System.out.print("Digite um nome pra posição " + i  + " do vetor 2: ");
      vetor2[i] = puxe.next();
    }
    System.out.println();
    String[] vetor3 = new String[(q1+q2)];
    for (int i = 0 ; i < q1 ; i++ ) {
      if (i < q2)
      vetor3[q1+i] = vetor2[i];
      vetor3[i] = vetor1[i];
    }Arrays.sort(vetor3);
    for (int i = 0; i < vetor3.length ; i++) {
      System.out.print(vetor3[i] + ", ");
    }
    puxe.close();
// SOBRE A CURIOSIDADE: O SORT ORDENA DE ACORDO COM A TABELA ASCII, E NA TABELA ASCII, S VEM ANTES DE Ã
  }
}
