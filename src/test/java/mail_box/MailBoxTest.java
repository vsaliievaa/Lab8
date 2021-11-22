package mail_box;

import client.Client;
import mail_info.MailInfo;
import mail_sender.MailCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    private MailBox mailbox;
    private MailInfo infoOne;
    private MailInfo infoTwo;
    private MailInfo infoThree;
    private Client first;
    private Client second;
    private Client third;
    private ArrayList<MailInfo> infos;

    @BeforeEach
    void setUp() {
        first = new Client("Alice", 20, "female", "alice@outlook.com");
        second = new Client("Alice", 18, "male", "bob@gmail.com");
        third = new Client("Chris", 25, "male", "chris@yahoo.com");
        infoOne = new MailInfo(first, MailCode.GREETINGS);
        infoTwo = new MailInfo(second, MailCode.HAPPY_BIRTHDAY);
        infoThree = new MailInfo(third, MailCode.GREETINGS);
        infos = new ArrayList<>();
        infos.add(infoOne);
        infos.add(infoTwo);
        mailbox = new MailBox(infos);
    }

    @Test
    void addMailInfo() {
        assertEquals(2, mailbox.getInfos().size());
        mailbox.addMailInfo(infoThree);
        assertEquals(3, mailbox.getInfos().size());
        MailInfo info = mailbox.getInfos().get(0);
        assertEquals("Alice", info.getName());
    }
}