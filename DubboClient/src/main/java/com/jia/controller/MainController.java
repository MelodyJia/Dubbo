package com.jia.controller;
import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * Created by jialianqing on 2016/10/18 0018.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/dubbo", method = RequestMethod.GET)
    public String DubboTest() throws  Exception {
        DubboClient dc =new DubboClient();
        dc.initClient();
        return "dubbo";
    }
}

