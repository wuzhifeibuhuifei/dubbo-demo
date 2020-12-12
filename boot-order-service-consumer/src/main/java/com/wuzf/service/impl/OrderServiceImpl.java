package com.wuzf.service.impl;

import com.wuzf.service.OrderService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.entity.UserAddress;
import org.apache.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;


    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id:"+userId);
        // 1. 查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }

}
