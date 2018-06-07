import java.util.Scanner;
public class questao3{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite a quantidade de alunos: ");
    int q =  puxe.nextInt();
    String[] nome = new String[q];
    double[] media = new double[q];
    for (int i = 0; i < q ; i++ ) {
      System.out.print("Digite o nome do " + (i+1) + "° aluno: ");
      puxe.nextLine;
      nome[i] = puxe.nextLine();
      System.out.print("Digite a media do aluno " + nome[i] + ": ");
      media[i] = puxe.nextDouble();
    }System.out.println("aluno ==> situação");
    for (int i = 0; i < q ; i++ ) {
      System.out.print(nome [i] + " ==> ");
      if (media[i] >=6)
        System.out.println("aprovado");
      else if(media[i] < 2)
        System.out.println("reprovado");
      else
        System.out.println("recuperação");
    }
    puxe.close();
  }
}
