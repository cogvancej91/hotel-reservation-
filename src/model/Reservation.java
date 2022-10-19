package model;

import java.util.Date;

public class Reservation {
    public Customer customer;
    public IRoom room;
    public Date checkInDate;
    public Date checkOutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public static void add(Customer customer) {

    }

    public String toString() {
        return getClass(). getName()+ "Hey you checkedIn on this " + checkInDate + " and checkOut on this " + checkOutDate;
    }
}

