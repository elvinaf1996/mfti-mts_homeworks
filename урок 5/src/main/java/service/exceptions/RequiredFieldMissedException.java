package service.exceptions;

public class RequiredFieldMissedException extends Exception{
    public RequiredFieldMissedException(String message) {
        super(message);
    }
    public RequiredFieldMissedException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Заполнены не все поля";
    }
}
