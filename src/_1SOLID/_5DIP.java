package _1SOLID;

interface MessageService
{
    void sendMessage(String message);
}

class EmailService
        implements MessageService
{
    @Override
    public void sendMessage(String message)
    {
        System.out.println(
                "Email Sent: " + message
        );
    }
}

class SmsService
        implements MessageService
{
    @Override
    public void sendMessage(String message)
    {
        System.out.println(
                "SMS Sent: " + message
        );
    }
}

class NotificationManager
{
    private MessageService messageService;

    public NotificationManager(
            MessageService messageService
    )
    {
        this.messageService =
                messageService;
    }

    public void notifyUser(String message)
    {
        messageService.sendMessage(
                message
        );
    }
}

public class _5DIP
{
    public static void main(String[] args)
    {
        MessageService emailService =
                new EmailService();

        NotificationManager emailManager =
                new NotificationManager(
                        emailService
                );

        emailManager.notifyUser(
                "Salary Credited"
        );

        MessageService smsService =
                new SmsService();

        NotificationManager smsManager =
                new NotificationManager(
                        smsService
                );

        smsManager.notifyUser(
                "Attendance Updated"
        );
    }
}