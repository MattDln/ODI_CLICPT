/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.clientscomptes.business;

import java.util.List;

/**
 *
 * @author DeillonM
 */
public class Customer {

    private Integer number;
    private String firstName;
    private String lastName;
    private List<Account> accounts;

    public Customer(Integer number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccountByNumber(Integer number) {
        return accounts.get(number);
    }

    public void createAccount() {
        Account account = new Account(this);
        accounts.add(account);
    }

    public void createAccount(Integer number, String name, Float balance, Float rate) {
        Account account = new Account(number, name, balance, rate, this);
        boolean isPresent = false;
        for (Account acc : accounts) {
            isPresent = isPresent && acc.equals(account);
        }
        if (isPresent) {
            throw new IllegalArgumentException();
        } else {
            accounts.add(account);
        }
    }

}
