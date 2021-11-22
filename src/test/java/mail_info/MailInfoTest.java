package mail_info;

import client.Client;
import com.sendgrid.helpers.mail.Mail;
import mail_sender.MailCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {

    private Client client;
    private MailCode mailCode;
    private MailInfo mailInfo;

    @BeforeEach
    void setUp() {
        client = new Client("Diane", 24,"female", "diane@ukr.net");
        mailInfo = new MailInfo(client, MailCode.GREETINGS);
    }

    @Test
    void getEmail() {
        assertEquals("diane@ukr.net", mailInfo.getEmail());
    }

    @Test
    void getName() {
        assertEquals("Diane", mailInfo.getName());
    }

    @Test
    void getAge() {
        assertEquals(24, mailInfo.getAge());
    }

    @Test
    void getClient() {
    }

    @Test
    void getMailCode() {
    }
}