package org.example.SistemaBancario;

public class SavingsAccount implements Account{

    public double depositar;
    public double interesRate;

    public SavingsAccount ( double interesRate) {
        this.depositar=0.0;
        this.interesRate=interesRate;
    }

    @Override
    public void deposit(double amount) {
        depositar += amount;

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= depositar){
            depositar-=amount;
        }else {
            System.out.println("Saldo Insuficiente");
        }

    }

    @Override
    public double calculaInterest() {
        return depositar*interesRate;
    }

    public double getDeposito(){
        return depositar;
    }
}
