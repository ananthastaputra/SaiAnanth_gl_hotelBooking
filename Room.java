package HotelBooking;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class  Room {
    public int roomId;
    public int floorNo;
    public String hotelName;
    public boolean available;
    public double price;
    public String occupancyType;
    public String roomType;





     Room(int roomId,int floorNo, String hotelName,String occupancy,String roomType) {
       this.roomId = roomId;
       this.floorNo = floorNo;
       this.hotelName = hotelName;
       this.available = false;
       this.occupancyType = occupancy;
       this.roomType = roomType;


    }

    public int getRoomId() {
        return this.roomId;
    }

    public static void bookRoom(ArrayList<Room> roomDb) {



        for (int i = 0; i < roomDb.size(); i++) {

//            System.out.println(roomDb.get(1).roomId);

        }


    }

    public boolean isAvailable() {
        return this.available;
    }

    public static void main(String[] args) {

        ArrayList <Room> roomDb = new ArrayList<>();


        Room room101 = new Room(101,1,"hotel1","single","Air Conditioned");
        Room room102 = new Room(102,1,"hotel1","double","Air Conditioned");
        Room room103 = new Room(103,1,"hotel1","double","Air Conditioned");
        Room room201 = new Room(201,2,"hotel1","single","Air Conditioned");

        roomDb.add(room101);
        roomDb.add(room102);
        roomDb.add(room103);
        roomDb.add(room201);




//        Scanner customer  = new Scanner(System.in);
//        System.out.println("Enter customer name :");
//        String name = customer.nextLine();
//        System.out.println("enter room type");
//        String roomType = customer.nextLine();
//        System.out.println("enter occupancy type");
//        String occupancyMode = customer.nextLine();


        bookRoom(roomDb);

//        for (int i = 0; i < roomDb.size(); i++) {
//
//            if (roomType.equals("Single")) {
//
//            }
//
//        }

    }

}
