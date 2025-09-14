package com.valeriy;

public class Test {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.width=1.0;
        box1.height=2.0;
        box1.length=3.0;
        Room workRoom = new Room();
        workRoom.width=10.0;
        workRoom.height=20.0;
        workRoom.length=30.0;
        workRoom.inner=box1;
        System.out.println("Capacity box: " + box1.getCapacity());
        System.out.println("Capacity room: " + workRoom.getCapacity());
    }
}
