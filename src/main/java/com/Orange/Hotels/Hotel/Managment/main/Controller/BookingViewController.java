package com.Orange.Hotels.Hotel.Managment.main.Controller;

import com.Orange.Hotels.Hotel.Managment.main.model.RoomBooking;
import com.Orange.Hotels.Hotel.Managment.main.service.roombookingservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingViewController {

    private final roombookingservice bookingService;

    public BookingViewController(roombookingservice bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/booking/{roomId}")
    public String bookingForm(@PathVariable Long roomId, Model model) {
        model.addAttribute("booking", new RoomBooking());
        model.addAttribute("roomId", roomId);
        return "booking";
    }

    @PostMapping("/booking/{roomId}")
    public String bookRoom(@ModelAttribute RoomBooking booking,
                           @PathVariable Long roomId) {
        bookingService.bookingroom(booking, roomId);
        return "redirect:/rooms";
    }

    @GetMapping("/checkout/{id}")
    public String checkout(@PathVariable long id) {
        bookingService.Checkout(id);
        return "redirect:/rooms";
    }
}
