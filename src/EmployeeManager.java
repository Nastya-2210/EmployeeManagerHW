package src;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private final List<Employee> employees = new ArrayList<>();
    private final IEmployeeRepository employeeRepository;
    private final INotificationService notificationService;
    private final EmployeeDataValidator validator;
    private final Logger logger;

    public EmployeeManager(IEmployeeRepository employeeRepository,
                           INotificationService notificationService,
                           EmployeeDataValidator validator1, Logger logger) {
        this.employeeRepository = employeeRepository;
        this.notificationService = notificationService;
        this.validator = validator1;
        this.logger = logger;
    }

    public void processEmployeeData(Employee emp) {

        if (employeeRepository.existsById(emp.getId())) {
            logger.log("Employee exists");
            return;
        }

        if (!employeeRepository.isConnected()) {
            logger.log("DB not connected");
            return;
        }

        employeeRepository.save(emp);
        employees.add(emp);
        notificationService.sendNotification(emp);
        logger.log("Added: " + emp.getName());
    }

    public void generateReport(IReportGenerator reportGenerator) {
        reportGenerator.generateReport();
    }
}
