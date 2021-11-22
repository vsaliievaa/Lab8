package mail_box;

import com.sendgrid.helpers.mail.Mail;
import lombok.Getter;
import mail_info.MailInfo;
import mail_sender.MailSender;

import java.util.ArrayList;

public class MailBox {
    @Getter
    private ArrayList<MailInfo> infos;

    public MailBox(ArrayList<MailInfo> infos) {
        this.infos = infos;
    }

    public void addMailInfo(MailInfo info) {
        this.infos.add(info);
    }

    public void sendAll() {
        MailSender sender = new MailSender();
        for (MailInfo i: this.infos) {
            sender.sendMail(i);
        }
    }
}
