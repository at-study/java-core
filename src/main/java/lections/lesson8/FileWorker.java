package lections.lesson8;

public interface FileWorker {

    boolean createFile(String filePath);

    boolean copyFile(String sourceFilePath, String destinationFilePath);

    boolean deleteFile(String filePath);

    long getFileSize(String filePath);

    String readFile(String filePath);

    boolean writeFile(String filePath, String content);

    boolean editFile(String filePath, int position, char replacement);

}
