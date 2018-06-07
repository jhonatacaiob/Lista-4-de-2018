import java.util.Scanner;
public class questao7{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite quantos numeros você vai digitar: ");
    int q = puxe.nextInt();
    double[] valores = new double[q];
    for (int i = 0; i < q ; i++ ) {
      System.out.print("Digite o " + (i+1) + "° número: ");
      valores[i] = puxe.nextDouble();
    }
    double soma, mult;
    System.out.println("Resultado: ");
    System.out.print(valores[0]);
    soma = mult = valores[0];
    for (int i = 1; i < q ; i++ ) {
      System.out.print(" + " + valores[i]);
      soma += valores[i];
    }System.out.print(" = " + soma + "\n");
    System.out.print(valores[0]);
    for (int i = 1; i < q ; i++ ) {
      System.out.print(" * " + valores[i]);
      mult *= valores[i];
    }System.out.print(" = " + mult);
    puxe.close();
  }
}
