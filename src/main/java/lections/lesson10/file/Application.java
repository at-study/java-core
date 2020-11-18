package lections.lesson10.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        File file = new File("src\\main\\java\\lections\\lesson10\\file\\UnaryApplication.java");
        File file2 = new File("src\\main\\java\\lections\\lesson10\\file\\Output.txt");
        File directory = new File("src\\main\\java\\lections\\lesson10\\file");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());

        System.out.println(file.getName());
        System.out.println(file.length());

        System.out.println(file.getTotalSpace());
        System.out.println(file.getFreeSpace());

        // Чтение из файла
        try (FileInputStream fis = new FileInputStream(file)) {
            int size = fis.available();
            byte[] content = new byte[size];
            fis.read(content);
            StringBuilder sb = new StringBuilder();
            for (byte b : content)
                sb.append((char) b);
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }



/*
        BufferedReader reader = new BufferedReader(new FileReader(new File("src\\main\\java\\lections\\lesson10\\files\\UnaryApplication.java")));
        String line = reader.readLine();
        System.out.println(line);

        // Запись в файл
        List<String> strings = Arrays.asList("Семь", "Пятниц", "На", "Неделе");
        FileOutputStream fos = new FileOutputStream(file2);
        for (String str : strings) {
            byte[] bytes = str.getBytes();
            fos.write(bytes);
        }
        fos.flush();
        fos.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src\\main\\java\\lections\\lesson10\\files\\output2.txt")));
        writer.write("sometext1");
        writer.write("sometext2");
        writer.flush();
        writer.close();
*/
    }

}
