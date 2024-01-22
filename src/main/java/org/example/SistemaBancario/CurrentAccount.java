package org.example.SistemaBancario;

public class CurrentAccount implements Account{
    public double depositar;
    public double overdraftLimit;

    public CurrentAccount (double overdraftLimit) {
        this.depositar=0.0;
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public void deposit (double amount) {
        depositar += amount;

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= depositar){
            depositar-=amount;
        }else {
            System.out.println("Fondo Insuficiente");
        }

    }

    @Override
    public double calculaInterest() {
        return depositar*overdraftLimit;
    }

    public double getDeposito(){
        return depositar;
    }
}
