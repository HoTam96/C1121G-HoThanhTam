package ss16_io_binary_file_and_amp_serialization.bai_tap.quan_li_san_pham.view.until;

import ss16_io_binary_file_and_amp_serialization.bai_tap.quan_li_san_pham.module.module.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriteFileProducrt {
    public static void writeProduct(List<Product>productList,String path)  {
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
             fileOutputStream = new FileOutputStream(file);
             objectOutputStream = new ObjectOutputStream(fileOutputStream);
             objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
    public static List<Product> readerProduct(String path){
        List<Product>productList= new ArrayList<>();
        FileInputStream fileInputStream= null;
        ObjectInputStream objectInputStream = null;
        File file = new File(path);
        try {
             fileInputStream = new FileInputStream(file);
             objectInputStream = new ObjectInputStream(fileInputStream);
             if (file.length()>0){
                 productList = (ArrayList<Product>)objectInputStream.readObject();
             }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream!=null) {
                try {
                    objectInputStream.close();
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
return productList;
    }
}
