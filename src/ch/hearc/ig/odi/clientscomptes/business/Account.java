/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.clientscomptes.business;

/**
 *
 * @author DeillonM
 */
public class Account {

    private Integer number;
    private String name;
    private Float balance;
    private Float rate;
    private Customer customer;

    public Account(Customer customer) {
        this.customer = customer;
    }

    public Account(Integer number, String name, Float balance, Float rate, Customer customer) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.rate = rate;
        this.customer = customer;
    }

    public Integer getNumber() {
        return number;
    }
        

    public void credit(Float amount) {
        this.balance += amount;
    }

    public void debit(Float amount) {
        this.balance -= amount;
    }

    public static void transfert(Float amount, Account source, Account target) {
        source.debit(amount);
        target.credit(amount);
    }

}

