/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dearborn.horseracingsimulation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dearbornchisale
 */
public class RaceManager {

    private List<Horse> horses;
    private List<Horse> finishOrder;
    private int raceLength;

    public RaceManager() {
        horses = new ArrayList<Horse>();
        finishOrder = new ArrayList<Horse>();
        this.raceLength = raceLength;

    }

    public int getRaceLength() {
        return raceLength;
    }

    public List<Horse> getHorses() {

        return horses;
    }

    public List<Horse> getFinishOrder() {
        return finishOrder;
    }

    public void addHorse(Horse horse) {
        horses.add(horse);
    }

    public void startRace() {

        List<Thread> threads = new ArrayList<>();

        for (Horse h : horses) {

            Thread thread = new Thread(h);

            threads.add(thread);

        }

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted while waiting for race to finish");
            }
        }

    }

    public boolean recordFinish(Horse horse) {

        if (horse.getPosition() >= raceLength && !horse.isFinished()) {
            horse.setFinished(true);
            finishOrder.add(horse);
            return true;
        }

        return false;
    }

    public void displayResult() {
        System.out.println("\n ==== RACE FINISHING ORDER ====");

        for (int i = 0; i < finishOrder.size(); i++) {
            Horse h = finishOrder.get(i);

            System.out.println((i + 1) + "st: " + h.getName());
        }

        System.out.println("\n==== FINAL POSITIONS  ====");
        for (Horse h : horses) {
            System.out.println(h.getName() + " → " + h.getPosition());
        }
    }

}
