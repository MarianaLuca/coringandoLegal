import Pack.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();


        System.out.println("***** BEM-VINDO(A) *****");
        System.out.println("-------------------------");

        System.out.println("Qual seu nome?");
        String nome = scan.nextLine();
        aluno.setNome(nome);

        System.out.println("Qual seu RA?");
        int ra = scan.nextInt();
        aluno.setRa(ra);

        System.out.println("Digite a nota da sua 1° prova: ");
        int p1 = scan.nextInt();
        if (p1 >= 0 && p1 <= 10) {
            p1 = p1;
            aluno.setProva1(p1);

            System.out.println("Digite a nota da sua 2° prova: ");
            int p2 = scan.nextInt();
            if (p2 >= 0 && p2 <= 10) {
                p2 = p2;
                aluno.setProva2(p2);

                System.out.println("Digite a nota do seu trabalho: ");
                int t = scan.nextInt();
                if (t >= 0 && t <= 10) {
                    t = t;
                    aluno.setTrab(t);

                    // retorna o resultado com os dados inseridos
                    System.out.println(aluno.retornaResultado());

                } else {
                    System.out.println("A nota da prova 1 deve estar entre 0 e 10.");
                }

            } else {
                System.out.println("A nota da prova 1 deve estar entre 0 e 10.");
            }

        } else {
            System.out.println("A nota da prova 1 deve estar entre 0 e 10.");
        }










    }
}