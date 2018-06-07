import java.util.Scanner;
public class questao8{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite um tamanho para o vetor: ");
    int q = puxe.nextInt();
    double[] vetor = new double[q];
    double min = 999999;
    double max = 0;
    for (int i = 0; i < q ; i++ ) {
      System.out.print("Digite o numero da posição " + i + " do vetor: ");
      vetor[i] = puxe.nextDouble();
      if (vetor[i] > max)
        max = vetor[i];
      if (vetor[i] < min)
        min = vetor[i];
    }double[] vetorC = new double[q];//(vetor crescente)
    int pvc = 0; //(posição vetor c)
    double aux = 0; // variavel auxiliar pra evitar ficar digitando
    for (double i = min; i <= max ; i++ ) {
      for (int j = 0; j < q ; j++ ) {
        aux = vetor[j];
        if (i == aux) {
          vetorC[pvc] = aux;
          pvc++;
        }else {
          continue;
        }
      }
    }System.out.print("Vetor Crescente: " + vetorC[0]);
    for (int i = 1; i < q ; i++ )
      System.out.print(" " + vetorC[i]);
    System.out.print("\n");
    System.out.println("Maior numero: " + max);
    System.out.println("Menor numero: " + min);
    System.out.print("Elementos multiplicados pelo maior elemento do vetor | ");
    System.out.println("Elementos divididos pelo menor elemento do vetor");
    for (int i = 0; i < q ; i++ ) {
      System.out.print(vetorC[i] + " * " + max + " = " + (vetorC[i] * max));
      System.out.print(" | ");
      System.out.println(vetorC[i] + " / " + min + " = " + (vetorC[i] / min));
    }
    puxe.close();
  }
}
