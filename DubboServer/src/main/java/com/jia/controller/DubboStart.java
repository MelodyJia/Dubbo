package com.jia.controller;

/**
 * Created by jialianqing on 2017/6/26 0026.
 */
public class DubboStart {
    public static void main(String[] args) throws Exception {
        DubboServer ds = new DubboServer();
        ds.initServer();
    }
}
