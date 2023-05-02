package org.defihq;

import java.util.Random;

public class Prover {

    public int generateNumber() {
        Random rand = new Random();
        int upperbound = 10;
        return rand.nextInt(upperbound);
    }
}
