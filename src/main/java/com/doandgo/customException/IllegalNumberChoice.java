package com.doandgo.customException;

public class IllegalNumberChoice extends Exception {

    public IllegalNumberChoice(String message){
        super(message);
    }

    public IllegalNumberChoice(){
        super("Merci de saisir un nombre du menu");
    }
}
