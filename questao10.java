import java.util.Scanner;
public class questao10{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite quantos alunos serão digitados: ");
    int q = puxe.nextInt();
    String[] alunos = new String[q];
    double[][] notas = new double[q][5];
    double media;
    for (int i = 0; i < q ; i++ ) {
      media = 0;
      System.out.print("Digite o nome do " + (i+1) + "° aluno: ");
      puxe.nextLine();
      alunos[i] = puxe.nextLine();
      for (int j = 0; j < 4 ; j ++ ) {
        System.out.print("Digite a nota do " + (j+1) + "° bimestre de " + alunos[i] + ": ");
        notas[i][j] = puxe.nextDouble();
        media += notas[i][j];
      }notas[i][4] = (media/4);
    }for (int i = 0; i < q ; i++ ) {
      media = notas[i][4];
      System.out.print(alunos[i] + " : ");
      System.out.print("Media: " + media);
      System.out.print(" | Situação: ");
      if ( media >= 7 )
        System.out.println("Aprovado");
      else if(media < 3)
        System.out.println("Reprovado");
      else
        System.out.println("Em Recuperação");
    }System.out.println("Lista dos alunos aprovados: ");
    for (int i = 0; i < q ; i++) {
      media = notas[i][4];
      if (media >= 7)
        System.out.println(alunos[i]);
    }System.out.println("Lista dos alunos em recuperação: ");
    for (int i = 0; i < q ;i++ ) {
      media = notas[i][4];
      if (media < 7 && media >= 3)
        System.out.println(alunos[i]);
    }System.out.println("Lista dos alunos reprovados: ");
    for (int i = 0; i < q ; i++ ) {
      media = notas[i][4];
      if(media < 3)
        System.out.println(alunos[i]);
    }
    puxe.close();
  }
}
