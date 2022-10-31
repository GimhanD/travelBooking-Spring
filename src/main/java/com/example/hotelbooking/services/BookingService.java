package com.example.hotelbooking.services;

import com.example.hotelbooking.Repository.BookingRepo;
import com.example.hotelbooking.dto.BookingDTO;
import com.example.hotelbooking.entity.Booking;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookingService {
    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private ModelMapper modelMapper;

    public BookingDTO createBooking(BookingDTO bookingDTO){
        bookingRepo.save(modelMapper.map(bookingDTO, Booking.class));
        return bookingDTO;
    }

    public List<BookingDTO> getAllBookings() {
        List<Booking>bookingList=bookingRepo.findAll();
        return modelMapper.map(bookingList,new TypeToken<List<BookingDTO>>(){}.getType());
    }

    public BookingDTO updateBooking(BookingDTO bookingDTO){
        bookingRepo.save(modelMapper.map(bookingDTO, Booking.class));
        return bookingDTO;
    }

    public boolean deleteBooking(BookingDTO bookingDTO){
        bookingRepo.delete(modelMapper.map(bookingDTO, Booking.class));
        return true;
    }
}
