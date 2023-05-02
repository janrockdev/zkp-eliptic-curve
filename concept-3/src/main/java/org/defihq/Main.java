package org.defihq;

public class Main {

    static Prover prover = new Prover();
    public static void main(String[] args) {

        System.out.println("Defined: p=23(modulus) and g=5(base)\n");
        int p = 23;
        int g = 5;

        int a = prover.generateNumber();
        //int a = 4;
        System.out.println("Alice picked random number (private key): " + a);

        int aPK = Math.floorMod((int) Math.pow(g,a),p);
        System.out.println("Alice's public key is: " + aPK + "\n");

        int b = prover.generateNumber();
        //int b = 3;
        System.out.println("Bob picked random number (private key): " + b);

        int bPK = Math.floorMod((int) Math.pow(g,b),p);
        System.out.println("Bob's public key is: " + bPK + "\n");

        System.out.println("Alice and Bob exchange the public keys.\n");

        int aS = Math.floorMod((int) Math.pow(bPK,a),p);
        System.out.println("Alice computes the shared secret: " + aS);
        int bS = Math.floorMod((int) Math.pow(aPK,b),p);
        System.out.println("Bob computes the shared secret: " + bS + "\n");

        if (aS == bS) {
            System.out.println("Alice and Bob can use shared secret: " + bS + " to encrypt message!");
        } else {
            System.out.println("There is a error in formula!");
        }

    }
}