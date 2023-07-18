package HW05;
//Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup
import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
public class Copy {
    public static void main(String[] args) {
        try {
            copy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copy() throws IOException {
        File folder = new File(".");
        File bckupfolder = new File("./backup");
        if (!bckupfolder.exists()) {
            Path path = Files.createDirectories(Paths.get("./backup"));
            System.out.printf("Директория %s создана\n", path.toString());
        }
        for (File file : folder.listFiles()) {
            if (file.isFile()) {
                Files.copy(Paths.get(file.getName()),
                        Paths.get(bckupfolder + "/" + file.getName()),
                        REPLACE_EXISTING);
                System.out.printf("Файл %s скопирован.\n", file.getName());
            }
        }
    }
}