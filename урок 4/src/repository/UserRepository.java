package repository;

import java.util.List;

public interface UserRepository {
    List<User> getAll();
    User getBy(String id);
    List<User>  save(User user);
    List<User> saveAll(List<User> users);
}
