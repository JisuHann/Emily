package com.example.emily;

public class response_model {
    String message;
    boolean isSend;

    response_model(String message, boolean isSend){
        this.message = message;
        this.isSend = isSend;
    }

    response_model(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSend() {
        return isSend;
    }

    public void setSend(boolean send) {
        isSend = send;
    }
}
