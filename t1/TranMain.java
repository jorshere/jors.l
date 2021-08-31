package com.jors.t1;

import java.util.ArrayList;

public class TranMain {
    public static void main(String[] args){
        ArrayList<Account> accounts = new ArrayList<>();
        ArrayList<Client> clients=new ArrayList<>();
        //Client [] clients=new Client[2];
       clients.add(new Client(1,"Saroj","5346254"));
        accounts.add(new Account(101,2000,4.5,clients.get(0)));
        accounts.add(new Account(102,3000,5.5,clients.get(0)));
        accounts.add(new Account(103,4000,6.5,clients.get(0)));

        clients.add(new Client(2,"Thanos","4567234"));
        accounts.add(new Account(104,2200,1.2,clients.get(1)));
        accounts.add(new Account(105,2300,1.3,clients.get(1)));
        accounts.add(new Account(106,2400,1.4,clients.get(1)));
        accounts.add(new Account(107,2500,1.5,clients.get(1)));

        accounts.get(0).withdraw(1000);
        accounts.get(2).deposit(5000);
        accounts.get(3).withdraw(1000);
        accounts.get(4).withdraw(1000);
        accounts.get(5).withdraw(1000);
        accounts.get(0).withdraw(1000);


        System.out.println(accounts.get(0));
        //
//        for(Client client: clients){
//            System.out.println("Client id: "+ client.getId());
//            for(Account account:accounts){
//                System.out.println("account"+ account.getId()+":");
//                System.out.println("W : "+account.getCount('W'));
//                System.out.println("D : "+account.getCount('D'));
//            }
//            System.out.println();
//        }

    }
}
