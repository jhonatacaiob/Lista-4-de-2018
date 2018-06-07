import java.util.Scanner;
public class questao6{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    //declarações
    System.out.print("Digite o tamanho do vetor: ");
    int q = puxe.nextInt();
    int pa, im;
    pa = im = 0;
    int max = 0;
    int min = 99999;
    int[] VetorOriginal = new int[q];
    // preenchimento
    // determino aqui também, qual o maior e o menor elemento do vetor
    // e ainda, quantos elementos terãao os vetores pares, e impares
    for (int i = 0; i < q ;i++ ) {
      System.out.print("Digite o valor da posição " + i + " do vetor: ");
      VetorOriginal[i] = puxe.nextInt();
      if (VetorOriginal [i] > max)
        max = VetorOriginal[i];
      if(VetorOriginal [i] < min)
        min = VetorOriginal[i];
      if (VetorOriginal[i] % 2 == 0)
        pa++;
      else
        im++;
    }
    int[] pares = new int[pa];
    int[] impares = new int[im];
    pa = 0;
    im = 0;
    int aux = 0;
    //o primeiro for vai de ordem crescente do menor ao maior elemento de VetorOriginal
    //a variavel aux foi só pra economizar caracteres
    //as variaveis pa e o im, indicam a posiçção em forma crescente, que os elementos devem ser adcionados nos vetores pares, e impares

    for (int i = min; i <= max ;i++ ) {
      for (int j = 0; j < q ; j++ ) {
        aux = VetorOriginal[j];
        if( i == aux){
          if (aux % 2 == 0) {
            pares[pa] = aux;
            pa++;
          }else {
            impares[im] = aux;
            im++;
          }
        }else if (i > aux) {
          break;
        }else{
          continue;
        }
      }
    }
    System.out.print("Vetor original: " + VetorOriginal[0]);
    for (int i = 1; i < q ;i++ ) {
      System.out.print(", ");
      System.out.print(VetorOriginal[i]);
    }System.out.print("\n");
    System.out.print("Vetor com valores pares em ordem crescente: " + pares[0]);
    for (int i =1; i < pa ;i++) {
      System.out.print(", ");
      System.out.print(pares[i]);
    }System.out.print("\n");
    System.out.print("Vetor com valores impares em ordem crescente: " + impares[0]);
    for (int i = 1; i < im ;i++ ) {
      System.out.print(", ");
      System.out.print(impares[i]);
    }
  puxe.close();
  }
}
