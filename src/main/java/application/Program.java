/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;
import model.exceptions.DomainException;

/**
 *
 * @author rafae
 */
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.println("number: ");
            int number = sc.nextInt();
            System.out.println("Holder:");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.println("Initial baçance:");
            double balance = sc.nextDouble();
            System.out.println("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.println("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.println(acc);

        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());

        }

    }
}
