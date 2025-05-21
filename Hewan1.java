package com.belajar2;

// Superclass
class Hewan {
    void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

// Subclass
class Anjing extends Hewan {
    // Method overriding
    @Override
    void suara() {
        System.out.println("Anjing menggonggong");
    }
}

// Program utama
public class Hewan1 {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        hewan1.suara();  // Output: Hewan mengeluarkan suara

        Hewan hewan2 = new Anjing();
        hewan2.suara();  // Output: Anjing menggonggong (karena overriding)
}
}