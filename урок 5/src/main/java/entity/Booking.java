package entity;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Booking {
    private String id;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Guest guest;
    private Room room;
}