package com.Orange.Hotels.Hotel.Managment.main.repository;

import com.Orange.Hotels.Hotel.Managment.main.model.RoomBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface roombookingrepository extends JpaRepository<RoomBooking,Long> {
}
