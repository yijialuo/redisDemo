package com.yijialuo.redis.controller;

import com.yijialuo.redis.dao.PersonDao;
import com.yijialuo.redis.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yijialuo on 2018/8/8.
 */
@RestController
public class DataController {
    @Autowired
    PersonDao personDao;

    @RequestMapping("/set")
    public void set(){
        Person person = new Person("1","wyf",32);
        personDao.save(person);
        personDao.stringRedisTemplateDemo();
    }

    @RequestMapping("/getStr")
    public String getStr(){
        return personDao.getString();
    }

    @RequestMapping("/getPerson")
    public Person getPerson(){
        return personDao.getPerson();
    }

}
