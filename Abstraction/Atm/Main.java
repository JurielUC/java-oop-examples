package Abstraction.Atm;

// Abstract class = like the ATM itself
abstract class ATM {
    // Abstract method (contract: must dispense money)
    abstract void dispenseCash();
    
    // Normal method (shared behavior)
    void insertCard() {
        System.out.println("Card inserted.");
    }
}

// Subclass for dispensing 100 bills
class ATM100 extends ATM {
    @Override
    void dispenseCash() {
        System.out.println("Dispensing 100 peso bills...");
    }
}

// Subclass for dispensing 500 bills
class ATM500 extends ATM {
    @Override
    void dispenseCash() {
        System.out.println("Dispensing 500 peso bills...");
    }
}

// Subclass for dispensing 1000 bills
class ATM1000 extends ATM {
    @Override
    void dispenseCash() {
        System.out.println("Dispensing 1000 peso bills...");
    }
}

public class Main {
    public static void main(String[] args) {
        ATM atm1 = new ATM100();
        ATM atm2 = new ATM500();
        ATM atm3 = new ATM1000();

        atm1.insertCard();
        atm1.dispenseCash();

        atm2.insertCard();
        atm2.dispenseCash();

        atm3.insertCard();
        atm3.dispenseCash();
    }
}
