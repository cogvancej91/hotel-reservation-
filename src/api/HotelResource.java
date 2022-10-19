package api;


import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;

import java.util.*;

public class HotelResource {
    Collection<Reservation> reservations = new ArrayList<Reservation>();
    Collection<Customer> customers = new ArrayList<Customer>();

    public Customer getCustomer(String email) {
        for (Customer customer: customers) {
            if (Objects.equals(customer.email, email))
                return customer;
        }
        return null;
    }

    public void createACustomer(String email, String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName, email);
        customers.add(customer);
    }
    public IRoom getRoom(String roomNumber) {
        for (Reservation reservation: reservations) {
            if (Objects.equals(reservation.room.getRoomNumber(), roomNumber)) {
                return reservation.room;
            }
        }
        return null;
    }
    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate) {
        Customer cus = getCustomer(customerEmail);
        Reservation reservation = new Reservation(cus,room,checkInDate,checkOutDate);
        reservations.add(reservation);
        return reservation;
    }
    public Collection<Reservation> getCustomerReservations(String customerEmail) {
        Collection<Reservation> cusreservations  = new ArrayList<Reservation>();
        Customer cus = getCustomer(customerEmail);
        if (cus != null) {
            for (Reservation reservation: reservations) {
                if (reservation.customer == cus) {
                    cusreservations.add(reservation);
                }
            }
        }
        return cusreservations;

    }
    public Collection<IRoom> findARoom(Date checkIn, Date checkOut) {
        Collection<IRoom> foundrooms = new ArrayList<IRoom>();
        for (Reservation reservation: reservations) {
            if (reservation.checkInDate.after(checkIn) && reservation.checkOutDate.before(checkOut)) {
                foundrooms.add(reservation.room);
            }
        }
        return foundrooms;
    }



}
