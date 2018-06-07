import java.util.Scanner;
public class questao1{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    int[] v = new int[10];
    System.out.println("Digite 10 numeros inteiros");
    for (int i = 0; i < v.length ; i++) {
      System.out.print("Digite o " + (i+1) + "° número: ");
      v[i] = puxe.nextInt();
    }
    puxe.close();
    int pares = 0;
    for (int i = 0;i < v.length ; ++i ) {
      if (v[i] % 2 == 0) {
        System.out.print(v[i] + " ");
        pares++;
      }
    }
    System.out.println("\nTem " + pares + " pares nessa lista");
    int impares = 10 - pares;
    for (int i = 0; i < v.length ;i++ ) {
      if (v[i] % 2 != 0)
        System.out.print(v[i] + ", ");
    }System.out.println("\nE " + impares + " impares");
  }
}
