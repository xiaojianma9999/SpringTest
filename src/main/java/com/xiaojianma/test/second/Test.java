package com.xiaojianma.test.second;

import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component("test2")
public class Test
{
    private String hello;

    @Override
    public String toString() {
        return "Test{" +
                "hello='" + hello + '\'' +
                '}';
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public static void sayHello(){
        System.out.println("hello ,I'm second test case !!!");
    }
}
