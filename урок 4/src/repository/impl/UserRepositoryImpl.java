package repository.impl;

import repository.User;
import repository.UserRepository;

import java.util.List;

import static repository.User.UserStatus.DELETED;

public class UserRepositoryImpl implements UserRepository {

    private List<User> users;

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public List<User> save (User user) {
        int count = 0;
        int id = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(user.getId())) {
                count = 1;
                id = i;
            }
        }
        if (count == 0){
            users.add(user);
        }
        else{
            users.set(id,user);
        }
        return users;
    }

    @Override
    public List<User> saveAll(List<User> users) {
        for(User user : users){
            save(user);
        }
        return users;
    }

    @Override
    public User getBy(String id) {
        int count = 0;
        for(User user : users){
            if (user.getId().equals(id)) {
                count += 1;
                return user;
            }
        }
        return null;
    }
}
