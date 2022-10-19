package model;


public class Room implements IRoom {
        public String roomNumber;
        public Double price;
        public RoomType roomType;

        @Override
        public String getRoomNumber () {
            return "Seven!";
        }

        @Override
        public Double getRoomPrice() {
              return 150.00;

        }

        @Override
        public RoomType getRoomType () {
            return RoomType.SINGLE;

        }

        @Override
        public boolean isFree () {
            return true;
        }
        @Override
        public String toString () {
            return getClass().getName() + "Room " + roomNumber+"is " + price.toString() + "per night" +
                    "and the type of room is " + roomType;
        }

    }
