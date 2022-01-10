package com.company.hm19;

public class Main {
    public static void main(String[] args) {
        PetrolStation petrol = new PetrolStation(5);
        new Thread(getPetrolRunner(petrol)).start();
        new Thread(getPetrolRunner(petrol)).start();
        new Thread(getPetrolRunner(petrol)).start();
        new Thread(getPetrolRunner(petrol)).start();
        new Thread(getPetrolRunner(petrol)).start();
    }
    static Runnable getPetrolRunner(PetrolStation petrol) {
        return petrol::comeIn;
    }
}
