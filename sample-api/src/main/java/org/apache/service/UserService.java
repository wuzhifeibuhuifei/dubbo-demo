package org.apache.service;

import org.apache.entity.UserAddress;

import java.util.List;

public interface UserService {


    List<UserAddress> getUserAddressList(String userId);
}
