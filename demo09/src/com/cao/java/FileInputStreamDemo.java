package com.cao.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class FileInputStreamDemo {

    public static void main(String[] args) {
        FileInputStreamDemo fIS = new FileInputStreamDemo();
//        fIS.testFileInputStream();
        fIS.testCopyFile();
    }

    public void testFileInputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file1 = new File("demo09\\1.jpg");
            File file2 = new File("demo09\\4.jpg");

            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            byte[] Buff = new byte[128];
            int len;
            while ((len = fis.read(Buff)) != -1) {
                String str = new String(Buff);
                fos.write(Buff);
                System.out.println(Arrays.toString(Buff));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void copyFile1(String oldPath, String desPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file1 = new File(oldPath);
            File file2 = new File(desPath);
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            byte[] Buff = new byte[1024];
            int len;
            while ((len = fis.read(Buff)) != -1) {
                fos.write(Buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void testCopyFile() {
        long start = System.currentTimeMillis();
        copyFile1("C:/Users/11475/Desktop/1.mp4", "C:/Users/11475/Desktop/2.mp4");
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }
}
