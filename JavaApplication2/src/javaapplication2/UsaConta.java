package javaapplication2;

import java.util.Scanner;

public class UsaConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            Conta conta1 = new Conta();
            Conta conta2 = new Conta();

           
            System.out.print("Digite o nome do titular da Conta 1: ");
            conta1.setNome(scanner.nextLine());

            System.out.print("Digite o valor a depositar para " + conta1.getNome() + ": ");
            double valor1 = scanner.nextDouble();

            System.out.print("Digite o percentual de acrescimo (%): ");
            double percentual1 = scanner.nextDouble();

            conta1.depositar(valor1, percentual1);
            scanner.nextLine(); 

          
            System.out.print("\nDigite o nome do titular da Conta 2: ");
            conta2.setNome(scanner.nextLine());

            System.out.print("Digite o valor a depositar para " + conta2.getNome() + ": ");
            double valor2 = scanner.nextDouble();

            System.out.print("Digite o percentual de acrescimo (%): ");
            double percentual2 = scanner.nextDouble();

            conta2.depositar(valor2, percentual2);
            
           
            System.out.println("\nConta 1 - Nome: " + conta1.getNome());
            System.out.printf("Conta 1 - Saldo: %.5f \n", conta1.getSaldo());

            System.out.println("\nConta 2 - Nome: " + conta2.getNome());
            System.out.printf("Conta 2 - Saldo: %.5f \n", conta2.getSaldo());

            
            System.out.println("\nDigite 1 para calcular novamente ou 0 para sair: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

        } while (opcao != 1); 

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
