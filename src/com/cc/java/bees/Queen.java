package com.cc.java.bees;

public class Queen extends HoneyBee{
    
    public String doYourJob(){
        return "I'm a Queen, any questions?";
    }

    @Override
    public String fly() {
        return "I' a Queen, I fly at 15mph.";
    }


}
