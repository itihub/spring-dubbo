package org.itihub.dubbo.provider.impl;

import org.itihub.dubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
