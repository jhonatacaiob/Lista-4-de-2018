import java.util.Scanner;
public class questao11{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite um tamanho para o vetor: ");
    int q = puxe.nextInt();
    int[] vetor = new int[q];
    int min = 99999;
    int max = 0;
    for (int i = 0; i < q ; i++ ) {
      System.out.print("Digite um valor para a posição " + i + " do vetor: ");
      vetor[i] = puxe.nextInt();
      if (vetor[i] > max)
        max = vetor[i];
      if(vetor[i] < min)
        min = vetor[i];
    }for (int i = min ; i <= max ;i ++ ) {
      int contador = 0;
      for (int j = 0; j < q ; j++ ) {
        if (i == vetor[j])
          contador++;
      }if (contador != 0)
        System.out.println("O numero " + i + " aparece " + contador + " vezes");
    }puxe.close();
  }
}
