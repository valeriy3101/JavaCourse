package com.valeriy;

public class Room extends Base{
    public Box inner;

    @Override
    public double getCapacity(){
        return super.getCapacity() - inner.getCapacity();
    }
}
