package com.jia.controller;

import com.jia.service.HelloService;
import com.jia.service.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
/**
 * Created by jialianqing on 2016/11/22 0022.
 */
public class DubboClient {

    public  void initClient () throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubbo-consumer.xml" });
        context.start();
        HelloService demoService = context.getBean("dubboService", HelloService.class);
        System.out.println(demoService.sayHello("aaa"));

       List<User> list = demoService.getUsers();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            for(User user:list){
                System.out.println(user.getAge());
                System.out.println(user.getName());
                System.out.println(user.getSex());
            }
        }
        System.in.read();
    }
}
