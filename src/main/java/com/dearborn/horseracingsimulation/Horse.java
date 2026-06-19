/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dearborn.horseracingsimulation;

import java.util.Random;

/**
 *
 * @author dearbornchisale
 */
public class Horse implements Runnable {

    private final String name;
    private final String color;
    private final int number;
    private double position;
    private boolean finished;
    private RaceManager raceManager;

    public Horse(String name, String color, int number, RaceManager raceManager) {
        this.name = name;
        this.color = color;
        this.number = number;
        this.position = 0;
        this.finished = false;
        this.raceManager = raceManager;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public double getPosition() {
        return position;
    }

    public boolean isFinished() {
        return finished;
    }

    public void updateHorsePosition(int distance) {
        if (distance > 0) {
            this.position += distance;
        }

    }

    @Override
    public void run() {

        Random random = new Random();

        while (!isFinished()) {
            int distance = random.nextInt(10) + 1;

            updateHorsePosition(distance);

            if (position >= raceManager.getRaceLength()) {
                raceManager.recordFinish(this);
                setFinished(true);
                break;
            }

            try {
                Thread.sleep(random.nextInt(300) + 100);
            } catch (InterruptedException e) {
                System.out.println("The thread was interrupted early!");
            }

            System.out.println(name + " is at: " + position);

        }

    }

}
