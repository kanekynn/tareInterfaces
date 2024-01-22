package org.example.SistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public List<Account> accounts = new ArrayList<>();


     public void addAccount(Account deposit){
         accounts.add(deposit);
    }

}
