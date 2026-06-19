/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.dearborn.horseracingsimulation;

/**
 *
 * @author dearbornchisale
 */
public class HorseRacingSimulation {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        RaceManager manager = new RaceManager();

        Horse h1 = new Horse("Bolt", "Black", 1, manager);
        Horse h2 = new Horse("Flash", "Brown", 2, manager);
        Horse h3 = new Horse("Storm", "White", 3, manager);

        manager.addHorse(h3);
        manager.addHorse(h2);
        manager.addHorse(h1);

        manager.startRace();

        manager.displayResult();

    }
}
