package com.cc.java;

import com.cc.java.bees.*;
import com.cc.java.birds.Bird;

public class App {
    public static void main(String[] args) {
      
    HoneyBee worker = new Worker();
    HoneyBee queen = new Queen();
    HoneyBee drone = new Drone();

    Bird bird = new Bird();

    ausgabe("----- Bees -----");
    ausgabe(worker.doYourJob());
    ausgabe(queen.doYourJob());
    ausgabe(drone.doYourJob());
    ausgabe("");
    ausgabe("----- Birds -----");
    ausgabe(bird.hasFeathers());
    ausgabe("");
    ausgabe("----- Bees & Birds -----");
    ausgabe(worker.fly());
    ausgabe(queen.fly());
    ausgabe(drone.fly());
    ausgabe(bird.fly());

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
