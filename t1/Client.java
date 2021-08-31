package com.jors.t1;

import java.util.ArrayList;

public class Client{
    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public Client(int id,String name,String phone){
        this.id=id;
        this.name=name;
        this.phone=phone;

        accounts=new ArrayList<>();
    }
    public boolean addAccount(Account acc){
        accounts.add(acc);
        return true;
    }
    public boolean removeAccount(int accountId){
        for(Account ac : accounts){
            if(ac.getId()==accountId){
                accounts.remove(ac);
                return true;
            }
        }
        return  false;
    }
    public String toString(){
        String s= this.id+" "+this.name+" "+this.phone+"\n";
        for (Account acnt: accounts)
            s+= acnt.toString()+"\n";
        return s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}