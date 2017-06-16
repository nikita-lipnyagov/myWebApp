package org.itstep.mywebapp.service;

import org.itstep.mywebapp.model.User;

import java.util.List;

public interface Service<T> {

    List<T> getAll();

    void delete(Integer id);
}
