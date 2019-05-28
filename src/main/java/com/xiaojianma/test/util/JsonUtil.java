package com.xiaojianma.test.util;

import org.springframework.util.StringUtils;

public class JsonUtil {

    public static <T> T getResponse(Class<T> tClass, String flag) throws Exception {
        if (StringUtils.isEmpty(flag) || tClass == null) {
            return null;
        }
        //return tClass.getDeclaredConstructor().newInstance();
        return JacksonUtil.fromJson(flag,tClass);
    }

    public static <T> T getResponse(Class<T> tClass) throws Exception {
        if (tClass == null) {
            return null;
        }
        return tClass.getDeclaredConstructor().newInstance();
    }

    public static <T> void printMsg(T... args) {
        for (T t : args) {
            System.out.println("泛型测试,t is " + t);
        }
    }

}
