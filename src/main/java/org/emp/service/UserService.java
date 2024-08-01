package org.emp.service;

import org.emp.dto.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {
     boolean login(User user);
     String register(User user);
}
