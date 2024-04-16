package interfaceexample;

import java.sql.SQLOutput;

class Car implements Vehicle {
    @Override
    public void move_forward() {
        System.out.println("출발");
    }

    @Override
    public void back() {
        System.out.println("후진");
    }
}
