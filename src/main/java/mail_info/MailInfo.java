package mail_info;

import client.Client;
import lombok.Getter;
import lombok.Setter;
import mail_sender.MailCode;

import java.util.HashMap;

public class MailInfo {

    @Getter @Setter
    private Client client;
    @Getter @Setter
    private MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }

    public String injectClientData() {
        String text = mailCode.generateText();

        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        for (String key: templates.keySet()) {
            text.replace(key, templates.get(key));
        }
        return text;
    }

    public String getEmail() {
        return client.getEmail();
    }

    public String getName() {
        return client.getName();
    }

    public int getAge() {
        return client.getAge();
    }
}
