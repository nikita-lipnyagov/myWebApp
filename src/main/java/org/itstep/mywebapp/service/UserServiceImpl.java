package org.itstep.mywebapp.service;

import org.itstep.mywebapp.model.User;
import org.itstep.mywebapp.repository.MockUserRepository;
import org.itstep.mywebapp.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository repository = new MockUserRepository();

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }

    @Override
    public User get(Integer id) {
        return repository.get(id);
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

}
