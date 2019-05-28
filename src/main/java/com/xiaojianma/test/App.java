package com.xiaojianma.test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.xiaojianma.test.model.Additionalinfo;
import com.xiaojianma.test.model.Student;
import com.xiaojianma.test.util.FileUtils;
import com.xiaojianma.test.util.Generic;
import com.xiaojianma.test.util.JacksonUtil;
import com.xiaojianma.test.util.JsonUtil;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.xiaojianma.test.util.JsonUtil.getResponse;
import static com.xiaojianma.test.util.JsonUtil.printMsg;

/**
 * Hello world!
 */
@Configuration
@ComponentScan(basePackages = "com.xiaojianma.test")
public class App {
    public void setTest1() {
        System.out.println("yhiuyi");
    }

    public static void main(String[] args) throws Exception {
        System.out.println(JsonUtil.getResponse(FileUtils.class, null));
        System.out.println(JsonUtil.getResponse(FileUtils.class, ""));
        System.out.println(JsonUtil.getResponse(FileUtils.class, "null"));
        System.out.println(JsonUtil.getResponse(Class.forName("com.xiaojianma.test.util.FileUtils"), "null"));
        System.out.println(JsonUtil.getResponse(Class.forName("com.xiaojianma.test.second.Test"), "null"));

        Object object = JsonUtil.getResponse(null);
        System.out.println(object);

        printMsg("shdf", 4545, new FileUtils());

        List<String> ls = new ArrayList<String>();


        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if (classStringArrayList.equals(classIntegerArrayList)) {
            System.out.println("泛型测试,类型相同");
        }

        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
//传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Generic<Integer> genericInteger = new Generic<Integer>(123456);

//传入的实参类型需与泛型的类型参数类型相同，即为String.
        Generic<String> genericString = new Generic<String>("key_vlaue");
        System.out.println("泛型测试,key is " + genericInteger.getKey());
        System.out.println("泛型测试,key is " + genericString.getKey());


        FileUtils fileUtils=new FileUtils();
        fileUtils.setAddInfo("hwehr");
        fileUtils.setFileName("hwehr");
        System.out.println(JacksonUtil.toJson(fileUtils));

        String str="{\n" +
                "\t\"fileName\": \"645555654\",\n" +
                "\t\"addInfo\": \"hwehr\"\n" +
                "}";

        System.out.println(JacksonUtil.fromJson(str,FileUtils.class));

        System.out.println(getResponse(FileUtils.class,str));

        Student student=new Student();
        student.setAdditionalinfo(new Additionalinfo());

        System.out.println(JacksonUtil.toJson(student));

        String currentPath=System.getProperty("user.dir");
        File file = new File(currentPath+"/src/main/Resources/data/Student.json");

        List<Student> studentList = JacksonUtil.fromFile(file, new TypeReference<List<Student>>() {
        });

        for (Student student1 : studentList) {
            /*System.out.println(student1.getSNo());*/
            System.out.println(student1);
        }

        File fileWrite = new File(currentPath+"/src/main/Resources/data/StudentWrite.json");

        JacksonUtil.toFile(fileWrite,studentList);



    }



}
