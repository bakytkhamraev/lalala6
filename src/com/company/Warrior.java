package com.company;

public class Warrior extends Player implements Supersposob {
    private String attackType;

    @Override
    public void prim() {
        System.out.println("Warrior");
    }
}