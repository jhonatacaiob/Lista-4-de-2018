import java.util.Scanner;
public class questao2{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite um tamanho pro vetor: ");
    int TamV = puxe.nextInt();
    int[] v = new int [TamV];
    for (int i = 0; i < TamV ; i++ ) {
      System.out.print("Digite um valor para a posição " + i + ": ");
      v[i] = puxe.nextInt();
    }System.out.println("Os numeros divisíveis por 2 são: ");
    for (int i = 0; i < TamV ; ++i ) {
      if (v[i] % 2 == 0)
        System.out.print(v[i] + ", ");
    }System.out.println("\nOs por 3 são: ");
    for (int i = 0; i < TamV ; i++) {
      if (v[i] % 3 == 0)
        System.out.print(v[i] + ", ");
    }System.out.println("\nE os por 2 e por 3 ao mesmo tempo, são: ");
    for (int i = 0 ; i < TamV ; ++i ) {
      if (v[i] % 6 == 0)
        System.out.print(v[i] + ", ");
    }
    puxe.close();
  }
}
