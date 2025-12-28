package com.Orange.Hotels.Hotel.Managment.main.Controller;

import com.Orange.Hotels.Hotel.Managment.main.model.room;
import com.Orange.Hotels.Hotel.Managment.main.service.roomservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rooms")
public class RoomViewController {

    private final roomservice roomService;

    public RoomViewController(roomservice roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String listRooms(Model model) {
        model.addAttribute("rooms", roomService.getallroom());
        return "rooms";   // rooms.html
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("room", new room());
        return "add-room";
    }

    @PostMapping("/add")
    public String addRoom(@ModelAttribute room room) {
        roomService.addroom(room);
        return "redirect:/rooms";
    }

    @GetMapping("/delete/{id}")
    public String deleteRoom(@PathVariable long id) {
        roomService.deleteById(id);
        return "redirect:/rooms";
    }
}
