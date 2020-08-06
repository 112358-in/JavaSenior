package com.cao.java;
/*
io
    File
    抽象基类                缓冲流                 节点流（文件流）
    InputStream         BufferInputStream       FileInputStream
    OutputStream        BufferOutputStream      FileOutputStream
    Reader              BufferReader            FileReader
    Writer              BufferWriter            FleWriter

 */

import java.io.*;

public class demo1 {

    public static void main(String[] args) {
        File file = new File("demo.txt");   //相较于当前工程下E:\IdeaProjects\JavaSenior\hello.txt
        System.out.println(file);
        System.out.println(file.getAbsolutePath());

        File file1 = new File("demo09\\demo.text"); //相较于当前Module下 E:\IdeaProjects\JavaSenior\demo09\demo.text
        System.out.println(file1.getAbsolutePath());

        demo1 demo1 = new demo1();
//        demo1.testFileReader2();
//        demo1.testFileWriter();
        demo1.testFileReaderFileWriter();
    }

    //    文件读取
    public void testFileReader() {
        FileReader fr = null;
        try {
            //实例化
            File file = new File("demo09\\hello.text");
            //文件流
            fr = new FileReader(file);
            //读文件
            int read = fr.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert fr != null;
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void testFileReader2() {
        FileReader fileReader = null;
        try {
            File file = new File("demo09\\hello.text");
            fileReader = new FileReader(file);

            char[] cBuf = new char[6];
            int len;
            while ((len = fileReader.read(cBuf)) != -1) {
//                for (int i=0;i<len;i++) {
//                    System.out.print(cBuf[i]);
//                }
                String str = new String(cBuf, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert fileReader != null;
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //    文件写入
    public void testFileWriter() {
        FileWriter fw = null;
        try {
            File file = new File("demo09\\hello.text");
            fw = new FileWriter(file, true);
            fw.write("\nI am tan wang lao zi");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fw != null;
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void testFileReaderFileWriter() {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            File file = new File("demo09\\helloA.text");
            fr = new FileReader(file);
            fw = new FileWriter(file, true);
            if (!file.exists()) {
                boolean newFile = file.createNewFile();
            } else {
                char[] cBuf = new char[16];
                int len;
                while ((len = fr.read(cBuf)) != -1) {
                    String str = new String(cBuf, 0, len);
                    System.out.println(str);
                    fw.write("\n呵呵");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
