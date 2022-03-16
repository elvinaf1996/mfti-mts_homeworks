package repository;

import java.util.List;

import static repository.User.UserStatus.ACTIVE;

public interface UserService {
    List<User> getUsers();
    void deleteUsers(List<User> user);
    User updateUser(String id, String firstName, String lastName, String middleName, String phone, String email);
    User createUser(String firstName, String lastName, String middleName, String phone, String email);

}
