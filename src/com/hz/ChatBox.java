package com.hz;

public class ChatBox {

    private ChatBoxMode _strategy;

    public void setChatBoxMode(ChatBoxMode strategy) {
        _strategy=strategy;
    }

    public String getResponse() {
       return  _strategy.getMsg();
    }


    }


