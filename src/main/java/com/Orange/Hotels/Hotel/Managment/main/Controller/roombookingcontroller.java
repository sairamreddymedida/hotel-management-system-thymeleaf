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

    @GetMapping("/checkout/{id}")
    public String checkout(@PathVariable long id) {
        s1.Checkout(id);
        return "redirect:/rooms";
    }

}
