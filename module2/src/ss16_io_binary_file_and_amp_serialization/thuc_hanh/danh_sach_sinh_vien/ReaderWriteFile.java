package ss16_io_binary_file_and_amp_serialization.thuc_hanh.danh_sach_sinh_vien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriteFile {


    public static void writeStudent(List<Student>studentList, String path)  {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream=null;

        try {
            File file = new File(path);
            if (!file.exists()){
                System.out.println("file không tồn tại");
            }
             fileOutputStream = new FileOutputStream(file);
             objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (objectOutputStream!=null){
                try {
                    objectOutputStream.close();
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

    }
    public static List<Student> readerStudent(String path){
        List<Student>studentList = new ArrayList<>();
        File file = new File(path);
        FileInputStream fileInputStream= null;
        ObjectInputStream objectInputStream =  null;


        try {
            fileInputStream = new FileInputStream(file);
            if (file.length()>0){
                objectInputStream = new ObjectInputStream(fileInputStream);
                studentList= (ArrayList<Student>) objectInputStream.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (objectInputStream!=null){
                try {
                    objectInputStream.close();
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return studentList;
    }

}
