package client;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {

    private String name;
    private int age;
    private String sex;
    private int id;
    private String Email;

    private static int idCounter;

    public Client(String name, int age, String sex) {
        idCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = idCounter;
    }
}
