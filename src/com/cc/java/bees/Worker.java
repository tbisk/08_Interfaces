package com.cc.java.bees;

public class Worker extends HoneyBee{
    
    public String doYourJob(){
        return "I'm a worker, I work all day!";
    }

    @Override
    public String fly() {
        return "I'm a Worker. I fly at 12mph!";
    }

}
