import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String matricula, nome;

        Funcionario operacao = new Funcionario();


        System.out.println("Digite a matrícula: ");
        matricula = teclado.nextLine();
        System.out.println("Digite o nome completo: ");
        nome = teclado.nextLine();

        System.out.println("Digite o salário bruto: ");
        operacao.salario_bruto = teclado.nextDouble();

        System.out.println("===Folha de pagamento===");

        System.out.println("Matrícula: " + matricula);
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário bruto: " + (operacao.salario_bruto));

        System.out.println("Deducao inss: " + (operacao.bruto(operacao.salario_bruto)));
        System.out.println("Salário Líquido: " + (operacao.liquido(operacao.salario_bruto)));


    }
}
