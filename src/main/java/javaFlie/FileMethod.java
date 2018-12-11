package javaFlie;

import java.io.File;
import java.io.IOException;

/**
 * @author lk
 * 2018/9/24 8:10
 * @description:
 */
public class FileMethod {

    private static String pathName = "C:\\Users\\科\\Desktop";

    private static String pathNames = "C:\\Users\\科\\Desktop\\file.txt";

    private static String filePathName = "C:\\Users\\科\\Desktop\\file";

    public File file(String pathName) {
        System.out.println("file==========");
        return new File(pathName);
    }

    public File createFile(String pathName) {
        System.out.println("createFile==========");
        File file = file(pathName);
        System.out.println(file.exists());
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    return file;
                } else {
                    return null;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return null;
        }
    }

    public void mkdir(String pathName) {
        System.out.println("mkdir==========");
        File file = file(pathName);
        file.mkdir();
        System.out.println("mkdir==========");
    }

    public void removeTo(String pathName) {
        System.out.println("remove=========");
        File file = file(pathName);
        file.renameTo(new File("C:\\Users\\科\\Desktop\\file\\file.txt"));
        System.out.println("remove=========");
    }

    public void delete(File file) {
        File s[] = file.listFiles();
        for (File file1 : s) {
            if (file1.isDirectory()) {
                delete(file1);
            } else {
                file1.delete();
            }
        }
    }

    public static void main(String[] args) {
        FileMethod fileMethod = new FileMethod();
        //创建对象
        fileMethod.file(pathName);
        fileMethod.file(pathNames);

        //创建文件
        fileMethod.createFile(pathName);
        fileMethod.createFile(pathNames);

        //创建文件夹
        fileMethod.mkdir(filePathName);

        //移动文件，或者重命名
        fileMethod.removeTo("C:\\Users\\科\\Desktop\\file.txt");

//        //删除文件
//        fileMethod.delete(fileMethod.file(filePathName));
    }
}
