import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileManager {

    /**Reads the contents of the file and returns the contents in the form of
     * String.
     * @param fileName The name of the file from which the data is to be read.
     * @return <code>String</code> containing the contents of the file.
     * */
    public static String readFile(String fileName) {
        String strData = "";
        if (!new java.io.File(fileName).exists()) {
            return strData;
        }

        File file = new File(fileName);
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        StringBuffer buff = new StringBuffer();
        try {
            fis = new FileInputStream(file);

            // Here BufferedInputStream is added for fast reading.
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
            String line = "";

            // dis.available() returns 0 if the file does not have more lines.
            while (dis.available() != 0) {

                // this statement reads the line from the file and print it to
                // the console.
                line = dis.readLine();
//                System.out.println(line);
                if (line.length() > 0) {
                    line = line.replaceAll("\"", "");
//                    System.out.println("APPEND : " + line);
                    buff.append(line + "\n");
                }
            }

            // dispose all the resources after using them.
            fis.close();
            bis.close();
            dis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buff.toString();

    }

    /**Write data to the given file.
     * @param fileName The name of the file in which the data is to be written.
     * @param data The data to be written.
     * @param append Boolean value indicating that whether to append the data
     * in the file.
     * @return <code>true</code> if the data is written successfully in the file;
     * <code>false</code> otherwise.
     * */
    public static boolean writeToFile(String fileName, String data, boolean append) {
        boolean isWrite = false;
        int dirIndex = fileName.lastIndexOf(getPathSeparator());
        if (dirIndex != -1) {
            String dir = fileName.substring(0, dirIndex) + getPathSeparator();
            java.io.File fDir = new java.io.File(dir);
            if (!fDir.exists()) {
                if (!fDir.mkdirs()) {
                    return false;
                }
            }
        }
        try {
            java.io.FileOutputStream fout = new java.io.FileOutputStream(fileName, append);
            java.nio.channels.FileChannel fChannelWriter = fout.getChannel();
            byte[] bytesToWrite = data.getBytes();
            java.nio.ByteBuffer bBuffW = java.nio.ByteBuffer.wrap(bytesToWrite);
            fChannelWriter.write(bBuffW);
            fChannelWriter.close();
            fout.close();
            isWrite = true;
        } catch (java.io.IOException ex) {
            System.out.println("Error Occured: Unable to write to file (" + fileName + ")");
            isWrite = false;
        }
        return isWrite;
    }

    /**Returns the path Separator.
     * @return <code>String</code> the path separator character.
     * */
    public static String getPathSeparator() {
        return java.io.File.separator;
    }
}
