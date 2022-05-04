package entity;

import lombok.*;
import lombok.extern.flogger.Flogger;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Guest {
    private String phone;
    private String email;
    private String firstName;
    private String lastName;
    private String middleName;
}