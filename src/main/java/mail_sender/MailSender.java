package mail_sender;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import lombok.SneakyThrows;
import mail_info.MailInfo;

public class MailSender {

    @SneakyThrows
    public void sendMail(MailInfo info) {
        Email from = new Email("no-reply@ucu.edu.ua");
        String subject = "Message from Lab 8";
        Email to = new Email(info.getEmail());
        Content content = new Content("plain/text", info.injectClientData());
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");
        request.setBody(mail.build());
        Response response = sg.api(request);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
        System.out.println(response.getHeaders());
    }
}
