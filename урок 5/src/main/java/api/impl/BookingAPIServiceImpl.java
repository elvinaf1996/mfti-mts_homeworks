package api.impl;

import api.BookingAPIService;
import entity.Booking;
import service.impl.BookingServiceImpl;

public class BookingAPIServiceImpl implements BookingAPIService {
    BookingServiceImpl bookingServiceImpl;

    public Booking createBooking(Booking booking){
        try {
            bookingServiceImpl.createBooking(booking);
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return booking;
    }
    public Booking updateBooking(String id, Booking Booking){
        try {
            return bookingServiceImpl.updateBooking(id, Booking);
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return null;
    }
    public Booking getBooking(String id){
        try {
            return bookingServiceImpl.getBy(id);
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return null;
    }
    public void deleteBooking(String id){
        try {
            bookingServiceImpl.deleteBooking(bookingServiceImpl.getBy(id));
        }
        catch(Exception ex){
            ex.getMessage();
        }
    }
}
