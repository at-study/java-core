package lections.lesson8;

public class FileHelper implements FileWorker {

    @Override
    public boolean createFile(String filePath) {
        return false;
    }

    @Override
    public boolean copyFile(String sourceFilePath, String destinationFilePath) {
        return false;
    }

    @Override
    public boolean deleteFile(String filePath) {
        return false;
    }

    @Override
    public long getFileSize(String filePath) {
        return 0;
    }

    @Override
    public String readFile(String filePath) {
        return null;
    }

    @Override
    public boolean writeFile(String filePath, String content) {
        return false;
    }

    @Override
    public boolean editFile(String filePath, int position, char replacement) {
        return false;
    }
}
