package org.emp.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.emp.dto.User;
import org.emp.entity.UserEntity;
import org.emp.repository.UserRepository;
import org.emp.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

   final UserRepository repository;
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        repository.save(new ObjectMapper().convertValue(user,UserEntity.class));
        return "OK";
    }
}
