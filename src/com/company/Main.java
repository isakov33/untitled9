package com.company;

public class Main {

    public static void main(String[] args) {
        HavingSuperAblitity [] superAblitities = {new Magik(),new Medic(), new Warrior()};
        for (int i = 0; i <superAblitities.length ; i++) {
            superAblitities[i].applySuperAbility("Magia");
            
        }
    }
}
