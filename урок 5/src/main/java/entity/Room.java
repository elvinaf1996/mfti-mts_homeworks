package entity;

import lombok.*;

import java.util.Objects;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Room {
    private String id;
    private String roomNumber;
    private Integer floor;
    private RoomType type;
    private String description;
    private Integer price;
    private Set<Booking> bookings;
}