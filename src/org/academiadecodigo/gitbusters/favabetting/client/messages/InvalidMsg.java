package org.academiadecodigo.gitbusters.favabetting.client.messages;

import org.academiadecodigo.gitbusters.favabetting.client.Client;
import org.academiadecodigo.gitbusters.favabetting.client.Print;

public class InvalidMsg implements Messages {
    @Override
    public void run(Client client, String msg) {
        new Print("message not recognized "+msg);
        //System.out.println("message not recognized "+msg);
    }
}
