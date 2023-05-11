import java.util.Scanner;

public class Prova1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AquaCheck : Aplicativo N°1 para verificação da sua hidratação diária\n");
        System.out.println("Preencha o formulário, para verificar se você atingiu sua meta diária\n");
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu peso atual em kg:");
        int peso = scanner.nextInt();
        System.out.println("Digite a quantidade de água que você já consumiu hoje, em litros:");
        double agua = scanner.nextDouble();

        double quantidadeRecomendada = Math.ceil((peso * 35) / 1000.0);
        double quantidadeConsumida;
        quantidadeConsumida = quantidadeRecomendada - agua;

        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Quantidade total de água ingerida: " + agua + " l");
        System.out.println("A quantidade ideal de água a ingerir é: " + quantidadeRecomendada + " l ");

        if (quantidadeConsumida <= 0) {
            System.out.println("Parabéns você atingiu a sua meta de hidratação diária !");
        } else {
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam: " + quantidadeConsumida + " litros ! Você consegue !");
        }
        scanner.close();
    }
}
