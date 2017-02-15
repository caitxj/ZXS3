package com.zuxia.dao;

import com.zuxia.entity.User;
import com.zuxia.util.EntityManager;

/**
 * Created by caitxj on 17-2-15.
 */
public class UserDao extends EntityManager<User,Integer> {


    public static void main(String[] args){

        User user=new User();
        new UserDao().save(user);
    }
}
