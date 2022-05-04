package repository;

import entity.Booking;

import java.awt.print.Book;
import java.util.Set;

public interface BookingRepository {
    Booking save(Booking booking);
    void delete(Booking booking);
    Booking getBy(String id);
    Set<Booking> getAll();
}