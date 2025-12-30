package com.Orange.Hotels.Hotel.Managment.main.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "hotelbooking")
public class RoomBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingid;
    @ManyToOne
    private room room;


    private String guestname;
    private LocalDate checkin;
    private LocalDate checkout;
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public long getBookingid() {
        return bookingid;
    }

    public void setBookingid(long bookingid) {
        this.bookingid = bookingid;
    }

    @Override
    public String toString() {
        return "RoomBooking{" +
                "bookingid=" + bookingid +
                ", room=" + room +
                ", guestname='" + guestname + '\'' +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                ", total=" + total +
                '}';
    }

    public room getRoom() {
        return room;
    }

    public void setRoom(room room) {
        this.room = room;
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }
}


