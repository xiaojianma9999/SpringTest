package com.xiaojianma.test.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * bean转json格式或者json转bean格式, 项目中我们通常使用这个工具类进行json---java互相转化
 */
public class JacksonUtil {
    private static ObjectMapper mapper = new ObjectMapper();

/*    private JacksonUtil() {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,true);
    }*/



    /*    public static String toJson(Object obj) throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createJsonGenerator(sw);
        mapper.writeValue(gen, obj);
        gen.close();
        return sw.toString();
    }

    public static <T> T fromJson(String jsonStr, Class<T> objClass)
            throws JsonParseException, JsonMappingException, IOException {
        return mapper.readValue(jsonStr, objClass);
    }*/


    /**
     * 将对象序列化
     *
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 反序列化对象字符串
     *
     * @param json
     * @param clazz
     * @return
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return mapper.readValue(json, clazz);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 反序列化字符串成为对象
     * @param json
     * @param valueTypeRef
     * @return
     */
    public static <T> T fromJson(String json, TypeReference<T> valueTypeRef) {
        try {
            return mapper.readValue(json, valueTypeRef);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 从文件中获取json 结构体 转换成对象
     * @param file
     * @param clazz
     * @return
     */
    public static <T> T fromFile(File file, Class<T> clazz) {
        try {
            return mapper.readValue(new FileInputStream(file), clazz);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 从文件中获取json 结构体 转换成对象
     * @param file
     * @param valueTypeRef
     * @return
     */
    public static <T> T fromFile(File file, TypeReference<T> valueTypeRef) {
        try {
            return mapper.readValue(new FileInputStream(file), valueTypeRef);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 从文件中获取json 结构体 转换成对象
     * @param file
     * @param object
     * @return
     */
    public static  void toFile(File file, Object object) {
        try {
             mapper.writeValue(file, object);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

