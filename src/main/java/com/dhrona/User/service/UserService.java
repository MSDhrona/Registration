package com.dhrona.User.service;

import com.dhrona.User.bean.UserRegistration;
import com.dhrona.User.entity.UserDetails;

public interface UserService {
    public UserDetails register(UserRegistration userRegistration);

}
