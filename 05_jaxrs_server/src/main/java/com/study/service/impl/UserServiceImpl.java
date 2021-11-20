package com.study.service.impl;

import com.study.pojo.Car;
import com.study.pojo.User;
import com.study.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @date: 2021/11/20
 * @author zhb
 */
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(User user) {
        System.out.println("save User:" + user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update User:" + user);
    }

    @Override
    public List<User> findUsers() {
        ArrayList<User> userList = new ArrayList<>();
        ArrayList<Car> carList1 = new ArrayList<>();
        carList1.add(new Car(1,"卡车",12.00));
        carList1.add(new Car(2,"汽车",16.00));
        User user1 = new User(1,"小明","北京",carList1);

        ArrayList<Car> carList2 = new ArrayList<>();
        carList2.add(new Car(3,"卡丁车",52.00));
        carList2.add(new Car(4,"汽油车",36.00));
        User user2 = new User(1,"小明","北京",carList2);

        userList.add(user1);
        userList.add(user2);

        return userList;
    }

    @Override
    public User findUserById(Integer id) {
        if (id == 1){
            ArrayList<Car> carList2 = new ArrayList<>();
            carList2.add(new Car(3,"卡丁车",52.00));
            carList2.add(new Car(4,"汽油车",36.00));
            User user = new User(5,"大爸爸","台湾",carList2);
            return user;
        }
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("delete user id:" + id);
    }
}
