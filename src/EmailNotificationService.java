package src;

//Сервис для отправки электронных писем

public class EmailNotificationService implements INotificationService{
    @Override
    public void sendNotification(Employee emp) {
        if (emp != null && emp.getEmail() != null && !emp.getEmail().isEmpty()) {
            System.out.println("Sending email to " + emp.getEmail());
        }
    }
}
