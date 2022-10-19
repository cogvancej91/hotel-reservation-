package model;


public class FreeRoom extends Room {

    public FreeRoom() {
        price = 0.0;
    }


    @Override
    public String toString() {
        return getClass(). getName()+ "This is a free room";
    }
}




