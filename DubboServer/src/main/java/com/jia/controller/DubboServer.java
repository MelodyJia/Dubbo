package com.jia.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jialianqing on 2016/11/22 0022.
 */
public class DubboServer {

    public  void initServer () throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider.xml"});
        context.start();

        System.gc();
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
