package Polymorphism.Atm;

// Abstract class (ATM "contract")
abstract class ATM {
    abstract void dispenseCash(); // each ATM must define how to dispense cash

    void insertCard() {
        System.out.println("Card inserted.");
    }
}

// Different ATM types (subclasses)
class ATM100 extends ATM {
    @Override
    void dispenseCash() {
        System.out.println("Dispensing 100 peso bills...");
    }
}

class ATM500 extends ATM {
    @Override
    void dispenseCash() {
        System.out.println("Dispensing 500 peso bills...");
    }
}

class ATM1000 extends ATM {
    @Override
    void dispenseCash() {
        System.out.println("Dispensing 1000 peso bills...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Parent class reference, different child objects
        ATM atm;

        atm = new ATM100();
        atm.insertCard();
        atm.dispenseCash();  // → 100 peso bills

        atm = new ATM500();
        atm.insertCard();
        atm.dispenseCash();  // → 500 peso bills

        atm = new ATM1000();
        atm.insertCard();
        atm.dispenseCash();  // → 1000 peso bills
    }
}
