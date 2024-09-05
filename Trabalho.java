import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chamada dos métodos
        String[] nomesFuncionarios = lerFuncionarios(scanner);
        double[] valorHoraFuncionarios = valorHora(scanner);
        int[] horasTrabalhadosFuncionarios = horasTrabalhados(scanner);

        // Informações mostradas
        for(int i = 0; i < nomesFuncionarios.length; i++) {
            System.out.println();
            System.out.println("Informações Inseridas:");
            System.out.println("Nome do funcionário: " + nomesFuncionarios[i]);
            System.out.println("Valor por hora: " + valorHoraFuncionarios[i]);
            System.out.println("Horas trabalhadas: " + horasTrabalhadosFuncionarios[i]);
            System.out.println("Valor total por horas: ");
            System.out.println("R$" + valorHoraFuncionarios[i] * horasTrabalhadosFuncionarios[i]);
            System.out.println("----------------------");
        }

        // Encerramento do código
        scanner.close();
    }

    // Método para ler o nome
    public static String[] lerFuncionarios(Scanner scanner) {
        int n = 2;
        String[] nomes = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o nome do funcionário " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        return nomes;

    }

    // Método para ler o valor por hora
    public static double[] valorHora(Scanner scanner) {
        int n = 2;
        double[] valor = new double[n];
        for(int i = 0; i < n; i++){
            System.out.println("Digite o valor por hora do funcionário " + (i + 1) + ": ");
            valor[i] = scanner.nextDouble();
        }
        return valor;
    }

    // Método para ler as horas trabalhas
    public static int[] horasTrabalhados(Scanner scanner) {
        int n = 2;
        int[] horas = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Digite as horas trabalhas pelo funcionário " + (i+1) + ": ");
            horas[i] = scanner.nextInt();
        }
        return horas;
    }
}