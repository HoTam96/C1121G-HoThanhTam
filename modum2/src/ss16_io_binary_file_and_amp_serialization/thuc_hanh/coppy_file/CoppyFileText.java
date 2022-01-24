package ss16_io_binary_file_and_amp_serialization.thuc_hanh.coppy_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CoppyFileText {
    private static final String PathFileSource = "src/ss16_io_binary_file_and_amp_serialization/thuc_hanh/coppy_file/FileSource.csv.csv";
    private static final String PathFileDest = "src/ss16_io_binary_file_and_amp_serialization/thuc_hanh/coppy_file/FileDest.csv";

    public static void coppyFileUsingJava7Files(File source, File dest) {
        try {
            Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void coppyFileUsingStream(String pathSource, String pathDest) {
        FileInputStream is = null;
        FileOutputStream os = null;
        File fileSource = new File(pathSource);
        File fileDest = new File(pathDest);

        try {
            os = new FileOutputStream(fileDest);
            is = new FileInputStream(fileSource);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {

                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }


    public static void main(String[] args) {
        File file1 = new File(PathFileSource);
        File file2 = new File(PathFileDest);
        coppyFileUsingJava7Files(file1, file2);
        coppyFileUsingStream(PathFileSource, PathFileDest);
    }

}
