package com.Orange.Hotels.Hotel.Managment.main.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hotel")
public class room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomid;
    private String roomtype;
    private double price;
    private boolean avaliable;

    public long getRoomid() {
        return roomid;
    }

    public void setRoomid(long roomid) {
        this.roomid = roomid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    @Override
    public String toString() {
        return "Room{" + "roomid=" + roomid + ", roomtype='" + roomtype + '\'' + ", price=" + price + ", avaliable=" + avaliable + '}';
    }
}
