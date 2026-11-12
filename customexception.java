
import java.util.*;

class underageexception extends Exception {

    underageexception() {
        super("You are too young ...");
    }
}

class drivinglicence {

    int age;

    void takeuserage() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter age");
        age = s.nextInt();
    }

    void verify() throws underageexception {
        if (age < 18) {
            underageexception uae = new underageexception();
            throw uae;
        } else {
            System.out.println("DL ISSUED");
        }
    }
}

class customexception {

    public static void main(String[] args) {
        drivinglicence d = new drivinglicence();
        d.takeuserage();
        try {
            d.verify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
