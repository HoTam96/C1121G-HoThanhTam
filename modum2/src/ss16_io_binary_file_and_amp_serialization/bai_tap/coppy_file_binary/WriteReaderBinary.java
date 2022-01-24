package ss16_io_binary_file_and_amp_serialization.bai_tap.coppy_file_binary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteReaderBinary {
    private static final String PathSource = "src/ss16_io_binary_file_and_amp_serialization/bai_tap/coppy_file_binary/Source.csv";
    private static final String PathDest = "src/ss16_io_binary_file_and_amp_serialization/bai_tap/coppy_file_binary/FileDest.csv";

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
        File file1 = new File(PathSource);
        File file2 = new File(PathDest);
        coppyFileUsingStream(PathSource, PathDest);

    }


}
