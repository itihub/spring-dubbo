package org.itihub.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 *  Spring 启动类
 *  手动加载配置文件
 */
public class Provider {
    public static void main( String[] args ) throws IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context-provider.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context-provider-zk.xml");
        context.start();
        // 阻塞
        System.in.read(); // 按任意键退出
    }
}
