package com.Orange.Hotels.Hotel.Managment.main.Controller;

import com.Orange.Hotels.Hotel.Managment.main.model.RoomBooking;
import com.Orange.Hotels.Hotel.Managment.main.service.roombookingservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotelroom")
public class roombookingcontroller {
    private final roombookingservice s1;

    public roombookingcontroller(roombookingservice s1) {
        this.s1 = s1;
    }

    @PostMapping("/bookingroom/{id}")
    public RoomBooking bookingroom(@RequestBody RoomBooking a, @PathVariable Long id) {
        return s1.bookingroom(a, id);
    }

    @PutMapping("/chechkout/{roomid}")
    public String checkout(@PathVariable long roomid) {
        return s1.Checkout(roomid);
    }
}
