package service.exceptions;

public class RoomNotFoundException extends Exception{
    public RoomNotFoundException(String message) {
        super(message);
    }
    public RoomNotFoundException() {super();}

    @Override
    public String getMessage() {
        return "Комната с таким id не найдена";
    }
}
