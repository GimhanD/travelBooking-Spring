package com.example.hotelbooking.controllers;

import com.example.hotelbooking.dto.BookingDTO;
import com.example.hotelbooking.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/booking")
@CrossOrigin
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping("/getBookings")
    public List<BookingDTO> getUser() {
        return bookingService.getAllBookings();
    }

    @PostMapping("/createBooking")
    public BookingDTO saveUser(@RequestBody BookingDTO bookingDTO) {
        return bookingService.createBooking(bookingDTO);
    }

    @PostMapping("/updateBooking")
    public BookingDTO updateBooking(@RequestBody BookingDTO bookingDTO) {
        return bookingService.updateBooking(bookingDTO);
    }

    @DeleteMapping("/deleteBooking")
    public boolean deleteBooking(@RequestBody BookingDTO bookingDTO) {
        return bookingService.deleteBooking(bookingDTO);
    }
}

