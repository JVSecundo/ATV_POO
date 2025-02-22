package javaapplication2;

public class Conta {
    private double saldo;
    private String nome;
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void depositar(double valor, double percentual) {
        double bonus = valor * (percentual / 100);
        this.saldo += valor + bonus;
    }
}
