package src;

public class Main {
    public static void main(String[] args) {
        // Создаём зависимости
        IEmployeeRepository repository = new MySQLEmployeeRepository();
        INotificationService notificationService = new EmailNotificationService();
        EmployeeDataValidator validator = new EmployeeDataValidator();
        Logger logger = new Logger();

        // Создаём менеджер сотрудников
        EmployeeManager manager = new EmployeeManager(repository, notificationService, validator, logger);

        // Создаём сотрудника
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Иван Иванов");
        emp.setAge(30);
        emp.setSalary(50000);
        emp.setEmail("ivan@example.com");

        Manager topManager = new Manager(emp);

        // Обрабатываем сотрудника
        manager.processEmployeeData(emp);

        // Генерируем отчёт в PDF
        manager.generateReport(new ExcelReportGenerator());
    }
}


