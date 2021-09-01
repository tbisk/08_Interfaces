package com.cc.java;
public class App {
    public static void main(String[] args) {
      
    HoneyBee worker = new Worker();
    HoneyBee queen = new Queen();
    HoneyBee drone = new Drone();

    Bird bird = new Bird();

    ausgabe("---- Bees ------");
    ausgabe(worker.doYourJob());
    ausgabe(queen.doYourJob());
    ausgabe(drone.doYourJob());

    ausgabe("---- Bird(s) ------");
    ausgabe(bird.hasFeathers());

    ausgabe("----- Bees & Bird(s)------");
    ausgabe(worker.fly());
    ausgabe(queen.fly());
    ausgabe(drone.fly());
    ausgabe(bird.fly());
    
    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
