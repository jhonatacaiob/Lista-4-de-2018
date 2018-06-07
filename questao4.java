import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Quantos produtos serão digitados: ");
    int q = puxe.nextInt();
    String[] produto = new String[q];
    double[] preco = new double[q];
    for (int i = 0; i < q ; i++ ) {
      System.out.print("Digite o nome produto do " + (i+1) + "° produto: ");
      puxe.nextLine();
      produto[i] = puxe.nextLine();
      System.out.print("Digite o preço do " + (i+1) + "° produto: ");
      preco[i] = puxe.nextDouble();
    }
/* As variaveis que começam com a letra maiuscula
sao os nome dos produtos, e as que começam com minusculo,
sao os valores*/
    String Caro = "";
    double caro = 0;
    String Barato = "";
    double barato = 99999;
    for (int i = 0 ; i < q ;++i) {
      if (preco[i] < barato) {
        Barato = produto[i];
        barato = preco[i];
      }if (preco[i] > caro) {
        Caro = produto[i];
        caro = preco[i];
      }
    }
    System.out.println("Produto mais barato: " + Barato);
    System.out.println("Preço: " + barato);
    System.out.println("Produto mais caro: " + Caro);
    System.out.println("Preço: " + caro);
    System.out.println("_____________________________________");
// termina aqui, a letra a)
// começa aqui o reajuste
    for (int i = 0; i < q ; i++ ) {
      System.out.println("Produto: " + produto[i]);
      if (preco[i] > 20)
        preco[i] *= 1.05;
      else
        preco[i] *= 1.1;
      System.out.println("Preço reajustado: " + preco[i]);
    }// aqui termina o reajuste
    System.out.println("Depois do reajuste:");
    /* aqui começa a segunda calculagem,
    no qual eu irei replicar o codigo da 19° linha,
    ate a 35° linha*/
    Caro = "";
    caro = 0;
    Barato = "";
    barato = 99999;
    for (int i = 0 ; i < q ;++i) {
      if (preco[i] < barato) {
        Barato = produto[i];
        barato = preco[i];
      }if (preco[i] > caro) {
        Caro = produto[i];
        caro = preco[i];
      }
    }System.out.println("________________________________");
    System.out.println("Produto mais barato: " + Barato);
    System.out.println("Preço: " + barato);
    System.out.println("Produto mais caro: " + Caro);
    System.out.println("Preço: " + caro);
    puxe.close();
  }
}
