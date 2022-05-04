package repository.impl;


import entity.Booking;
import lombok.AllArgsConstructor;
import repository.BookingRepository;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
public class BookingRepositoryImpl implements BookingRepository {
    private static Set<Booking> bookings =  new HashSet<>();

    @Override
    public Booking save(Booking booking) {
        for (Booking realBooking : bookings){
            if(realBooking.getId().equals(booking.getId())){
                bookings.remove(realBooking);
                break;
            }
        }
        bookings.add(booking);
        return booking;
    }

    @Override
    public void delete(Booking booking) {
        for (Booking realBooking : bookings){
            if(bookings.contains(realBooking)){
                bookings.remove(realBooking);
                break;
            }
        }
    }

    @Override
    public Booking getBy(String id) {
        for(Booking realBooking : bookings){
            if(realBooking.getId().equals(id)){
                return realBooking;
            }
        }
        return null;
    }

    public Set<Booking> getAll() {
        return bookings;
    }
}
