package service.impl;

import entity.Booking;
import entity.Room;
import lombok.AllArgsConstructor;
import repository.BookingRepository;
import service.BookingService;
import service.RoomService;
import service.exceptions.BookingNotFoundException;
import service.exceptions.RequiredFieldMissedException;
import service.exceptions.RoomNotFoundException;

import java.util.Set;

@AllArgsConstructor
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    private final RoomService roomService;

    @Override
    public Booking getBy(String id) {
        try {
            if (bookingRepository.getBy(id) != null) {
                return bookingRepository.getBy(id);
            } else {
                throw new BookingNotFoundException();
            }
        } catch (BookingNotFoundException e) {
            e.getMessage();
            return null;
        }
    }
    @Override
    public Booking createBooking(Booking booking) {
        try {
            if (booking.getCheckIn() == null | booking.getCheckOut() == null
                    | booking.getGuest() == null | booking.getRoom() == null) {
                throw new RequiredFieldMissedException();
            } else if (roomService.updateRoom(booking.getRoom().getId(), booking.getRoom()) == null) {
                throw new RoomNotFoundException();
            } else {
                roomService.updateRoom(booking.getRoom().getId(), booking.getRoom());
                return booking;
            }

        }
        catch(RequiredFieldMissedException ex){
            ex.getMessage();
        }
        catch(RoomNotFoundException ex){
            ex.getMessage();
        }
        return null;
    }

    @Override
    public Booking updateBooking(String id, Booking booking) {
        try {
            if (id == null) {
                throw new RequiredFieldMissedException();
            } else if (bookingRepository.getBy(booking.getId()) == null) {
                throw new BookingNotFoundException();
            } else if (booking.getRoom() != null & roomService.updateRoom(id, booking.getRoom()) == null) {
                throw new RoomNotFoundException();
            } else {
                bookingRepository.save(booking);
                //не совсем поняла как обновить комнату, если нам задавалось только бронирование
                // что считать прежней, а что текущей комнатой???
                //и что за id мы в начале передавали вообще???
            }
        }
        catch(RequiredFieldMissedException ex){
            ex.getMessage();
        }
        catch(BookingNotFoundException ex){
            ex.getMessage();
        }
        catch(RoomNotFoundException ex){
            ex.getMessage();
        }
        return booking;

    }

    @Override
    public void deleteBooking(Booking booking) {
        bookingRepository.delete(booking);
        booking.getRoom().getBookings().remove(booking);
    }

}