package service.exceptions;

public class BookingNotFoundException extends Exception{
    public BookingNotFoundException(String message) {
        super(message);
    }
    public BookingNotFoundException() {super();}

    @Override
    public String getMessage() {
        return "Бронирование с таким id не найдено";
    }
}
