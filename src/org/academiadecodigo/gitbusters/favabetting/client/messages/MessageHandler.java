package org.academiadecodigo.gitbusters.favabetting.client.messages;

public enum MessageHandler {
    NOFUNDS("noFunds",new NoFunds()),
    GETHORSES("HorseList",new HorsesMsg()),
    INVALID("",new InvalidMsg());


    private String cmd;
    private Messages action;

    MessageHandler(String cmd,Messages action){
        this.cmd=cmd;
        this.action=action;
    }

    public static MessageHandler getActionFromString(String msg){
        if(msg==null|| msg.equals("")){
            return INVALID;
        }
        String actionStr=msg.split(" ")[0];
        for (MessageHandler actions:values()){
            if(actions.cmd.equals(actionStr)){
                return actions;
            }
        }
    return INVALID;
    }

    public Messages getAction() {
        return action;
    }
}