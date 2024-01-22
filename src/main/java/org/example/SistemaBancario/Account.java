package org.example.SistemaBancario;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculaInterest();
}
