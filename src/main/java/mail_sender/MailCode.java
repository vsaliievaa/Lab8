package mail_sender;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public String generateText() {
        String text = "";
        Path currentRelativePath = Paths.get("");
        String p = currentRelativePath.toAbsolutePath().toString();
        File file = new File(p + "\\" + filename + ".txt");
//        try {
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            text += s;
        }
        sc.close();
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        return text;
    }
}
