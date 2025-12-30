package com.Orange.Hotels.Hotel.Managment.main.Controller;

import com.Orange.Hotels.Hotel.Managment.main.model.room;
import com.Orange.Hotels.Hotel.Managment.main.service.roomservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class roomcontroller {
    private final roomservice s;

    public roomcontroller(roomservice s) {
        this.s = s;
    }

    @PostMapping("/addroom")
    public room addroom(@RequestBody room a) {
        return s.addroom(a);
    }

    @GetMapping("/getallroom")
    public List<room> getallroom() {
        return s.getallroom();
    }

    @PutMapping("/updateroom/{id}")
    public room updateroom(@PathVariable long id, @RequestBody room a) {
        return s.updateroom(id, a);
    }

    @GetMapping("/getroomid/{id}")
    public room getroomid(@PathVariable long id) {
        return s.getroomid(id);
    }

    @DeleteMapping("/deleteall")
    public String deleteallroom() {
        s.deleteallroom();
        return "All rooms deleted!";
    }

}

