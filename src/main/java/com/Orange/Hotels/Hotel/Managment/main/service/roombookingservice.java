package com.Orange.Hotels.Hotel.Managment.main.service;

import com.Orange.Hotels.Hotel.Managment.main.model.RoomBooking;
import com.Orange.Hotels.Hotel.Managment.main.model.room;
import com.Orange.Hotels.Hotel.Managment.main.repository.roomrepository;
import org.springframework.stereotype.Service;
import com.Orange.Hotels.Hotel.Managment.main.repository.roombookingrepository;

import java.time.temporal.ChronoUnit;

@Service
public class roombookingservice {
    private final roombookingrepository r1;
    private final roomrepository r2;

    public  roombookingservice(roombookingrepository r1, roomrepository r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public  RoomBooking bookingroom(RoomBooking a, Long roomid) {
        room room1 = r2.findById(roomid).orElseThrow();
        if (!room1.isAvaliable()) {
            throw new RuntimeException("Room is already booked");
        }
        long day = ChronoUnit.DAYS.between(a.getCheckin(), a.getCheckout());
        double total1 = day * (room1.getPrice());
        a.setRoom(room1);
        room1.setAvaliable(false);
        a.setTotal(total1);
        r2.save(room1);
        return r1.save(a);
    }

    public String Checkout(long roomid) {
        RoomBooking r3 = r1.findById(roomid).orElseThrow();
        room room1 = r3.getRoom();
        room1.setAvaliable(true);
        r2.save(room1);
        return "Check out Successfully";

    }

}
