package org.example;

import org.example.SistemaBancario.Account;
import org.example.SistemaBancario.Bank;
import org.example.SistemaBancario.CurrentAccount;
import org.example.SistemaBancario.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank bank01 = new Bank();


        // agregar
        SavingsAccount savingsAccount = new SavingsAccount(5);
        bank01.addAccount(savingsAccount);

        CurrentAccount currentAccount = new CurrentAccount(6);
        bank01.addAccount(currentAccount);
        savingsAccount.deposit(500);
        currentAccount.deposit(700);

        // retirar
        savingsAccount.withdraw(100);
        currentAccount.withdraw(300);
        System.out.println("saldo de la cuneta ahorros "+savingsAccount.getDeposito());
        System.out.println("saldo de la cuenta corriente "+currentAccount.getDeposito());









        //sistema.agregarUsuario(new EstudianteProfesor(1, "Juan"));


    }
}