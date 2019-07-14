package com.example.emily;

public class response_model {
    String message;
    int tipo;                                                           //bot:0, user:1

    response_model(String message, int tipo){
        this.message = message;
        this.tipo = tipo;
    }

    response_model(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
