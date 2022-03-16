package repository.impl;

import repository.User;
import repository.UserRepository;
import repository.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static repository.User.UserStatus.DELETED;
import static repository.User.UserStatus.ACTIVE;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {

        ArrayList<User> usersActive = new ArrayList<User>();
        List<User> users = userRepository.getAll();

        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getStatus() == User.UserStatus.ACTIVE){
                usersActive.add(users.get(i));
            }
        }
        return usersActive;
    }

    public void deleteUsers(List<User> user) {
        for(int i = 0; i< user.size(); i++) {
            user.get(i).setStatus(DELETED);
        }
        userRepository.saveAll(user);
    }
    public User updateUser(String id, String firstName, String lastName, String middleName, String phone, String email) {
        User newUser = new User(id, firstName, lastName, middleName, phone, email, ACTIVE);
        List<User> users = userRepository.getAll();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                if (users.get(i).getStatus() == DELETED) {
                    System.out.print("Can't update user with id " + id + ", because it's status is DELETED");
                } else {
                    users.set(i, newUser);
                }
            }
        }
        return newUser;
    }
    public User createUser(String firstName, String lastName, String middleName, String phone, String email) {
        String id = UUID.randomUUID().toString();
        User newUser = new User(id, firstName, lastName, middleName, phone, email, ACTIVE);
        userRepository.save(newUser);
        return newUser;
    }

}
