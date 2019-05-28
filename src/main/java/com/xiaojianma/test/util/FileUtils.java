package com.xiaojianma.test.util;

public class FileUtils {

    private String fileName;

    private String addInfo;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }

    @Override
    public String toString() {
        return "FileUtils{" +
                "fileName='" + fileName + '\'' +
                ", addInfo='" + addInfo + '\'' +
                '}';
    }
}
