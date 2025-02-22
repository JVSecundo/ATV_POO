package com.mycompany.mavenproject1;

import java.util.Date;
import java.util.Scanner;

class Usuario {
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private byte receita;

    //  construtor
    public Usuario(int id, String nome, String endereco, String email, byte receita) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.receita = receita;
    }

    // mmetodos
    public void consultaMedicamento() {
        System.out.println(nome + " esta consultando um medicamento.");
    }

    public void comprarMedicamento() {
        System.out.println(nome + " esta comprando um medicamento.");
    }

    public void efetuaPagamento() {
        System.out.println(nome + " esta efetuando o pagamento.");
    }

    public void calcularImposto(double valorMedicamento) {
        double imposto;
        if (valorMedicamento > 100.00) {
            imposto = valorMedicamento * 0.15; 
        } else {
            imposto = valorMedicamento * 0.10; 
        }
        System.out.println("O valor do imposto sobre o medicamento ee: R$ " + String.format("%.2f", imposto));
    }
}

public class Mavenproject1 {
    public static void main(String[] args) {
        mostrarDataAtual();
        compararNumeros();

        //objeto Usuario e chamando os métodos
        Usuario usuario = new Usuario(1, "Joao", "Rua A, 123", "joao@email.com", (byte) 1);
        usuario.consultaMedicamento();
        usuario.comprarMedicamento();
        usuario.efetuaPagamento();

        //  chamando o metodo para calcular imposto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do medicamento: ");
        double valorMedicamento = scanner.nextDouble();
        usuario.calcularImposto(valorMedicamento);

        scanner.close();
    }

    public static void mostrarDataAtual() {
        Date objDate = new Date();
        System.out.println("A data de hoje em milissegundos e: " + objDate.getTime());
    }

    public static void compararNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior numero e: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior numero e: " + num2);
        } else {
            System.out.println("Os dois numeros sao iguais: " + num1);
        }
    }
}