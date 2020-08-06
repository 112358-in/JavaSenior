package com.cao.java;


import java.io.*;

public class buffStream {
    public static void main(String[] args) {

        buffStream bs = new buffStream();
//        bs.CopyFile("demo09\\1.jpg","demo09\\5.jpg");
        long s=System.currentTimeMillis();
        bs.CopyFile("C:/Users/11475/Desktop/1.mp4","C:/Users/11475/Desktop/2.mp4");
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }

    public void CopyFile(String srcPath,String destPath){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            buffStream bS = new buffStream();

            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buff = new byte[65535];
            int len;
            while ((len = bis.read(buff)) != -1) {
                bos.write(buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null)
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bos != null)
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
