package service;

import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;

import java.util.*;

public class ReservationService {
     public List<IRoom> Rooms = new ArrayList<>();
     public List<Reservation> reservations = new ArrayList<>();

    public void addRoom(IRoom room) {
        this.Rooms.add(room);
    }
    public IRoom getARoom(String roomID) {
        IRoom foundRoom = null;
        for (IRoom room : Rooms) {
            if (Objects.equals(Room.ID, roomID)) {
                foundRoom = room;
            }
        }
        return foundRoom;
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        return new Reservation(customer, room, checkInDate, checkOutDate);
    }
    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        Collection<IRoom> rooms = new ArrayList<IRoom>();
        for (Reservation reservation: reservations) {
            if (checkInDate.after(reservation.checkInDate) && checkOutDate.before(reservation.checkOutDate)) {
                rooms.add(reservation.room);
            }
        }
        return rooms;
    }
    
    public Collection<Reservation> getCustomersReservation(Customer customer) {
        Collection<Reservation> reservations1 = new ArrayList<Reservation>();
        for (Reservation reservation : reservations) {
            if (reservation.customer == customer) {
                reservations1.add(reservation);
            }
        }
        return reservations1;
    }

    public void printAllReservation() {

    }

}
