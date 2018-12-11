package javaFlie.javaIo;

import java.io.*;
import java.nio.file.Files;
import java.util.Calendar;

/**
 * @author lk
 * 2018/9/27 8:47
 * @description:
 */
public class ByteFile {
    //读取文件txt
    public void readFile(String path) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
            while (true) {
                int i = fileReader.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readPhoto(String path) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            fileOutputStream = new FileOutputStream("C:\\Users\\科\\Desktop\\file\\test\\file.png");
            int i;
            while ( (i = fileInputStream.read()) != -1 ) {
                fileOutputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void bufferReadPhoto(String path) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            fileOutputStream = new FileOutputStream("C:\\Users\\科\\Desktop\\file\\test\\file1.png");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int i;
            while ( (i = bufferedInputStream.read()) != -1 ) {
                bufferedOutputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedOutputStream.flush();
                bufferedInputStream.close();
                bufferedOutputStream.close();
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

//        ByteFile byteFile = new ByteFile();
//        //byteFile.readFile("C:\\Users\\科\\Desktop\\file\\file.txt");
//        System.out.println("自己写的开始" + Calendar.getInstance().getTime());
//        byteFile.readPhoto("C:\\Users\\科\\Desktop\\file\\test.png");
//        System.out.println("结束自己写的" + Calendar.getInstance().getTime() + "自己写的开始");
//        byteFile.bufferReadPhoto("C:\\Users\\科\\Desktop\\file\\test.png");
//        System.out.println("结束" + Calendar.getInstance().getTime());
    }
}
