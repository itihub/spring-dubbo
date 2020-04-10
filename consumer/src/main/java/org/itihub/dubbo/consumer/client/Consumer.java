package org.itihub.dubbo.consumer.client;

import org.itihub.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Consumer {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context-consumer.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context-consumer-zk.xml");
        context.start();

        while (true){
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            // 获取接口
            DemoService demoService = (DemoService) context.getBean("demoService");
            String result = demoService.sayHello(message);
            System.out.println(result);
        }
    }
}
