package com.Orange.Hotels.Hotel.Managment.main.service;

import com.Orange.Hotels.Hotel.Managment.main.model.room;
import com.Orange.Hotels.Hotel.Managment.main.repository.roomrepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class roomservice {
    private final roomrepository r;

    public roomservice(roomrepository r) {
        this.r = r;
    }

    public room addroom(room a) {
        a.setAvaliable(true);
        return r.save(a);
    }

    public List<room> getallroom() {
        return r.findAll();

    }

    public room updateroom(long roomid, room a) {
        room a1 = r.findById(roomid).orElseThrow();
        a1.setRoomtype(a.getRoomtype());
        return r.save(a1);
    }

    public room getroomid(long roomid) {
        return r.findById(roomid).orElse(null);
    }

    public String deleteallroom() {
        r.deleteAll();

        return "all record deleted";
    }

    public void deleteById(long id) {
        r.deleteById(id);
    }


}
