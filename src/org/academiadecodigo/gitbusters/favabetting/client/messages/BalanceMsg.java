package org.academiadecodigo.gitbusters.favabetting.client.messages;

import org.academiadecodigo.gitbusters.favabetting.client.Client;

public class BalanceMsg implements Messages {

    @Override
    public void run(Client client, String msg) {
        String msgSplit=msg.split(" ")[1];
        System.out.println("you have "+msgSplit+"$");
    }
}