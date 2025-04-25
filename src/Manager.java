package src;

public class Manager extends Employee implements IManagerActions, IManagerSalaryValidator {
    private final IEmployeeMutable employee;
    private static final double MIN_MANAGER_SALARY = 5000;

    public Manager(IEmployeeMutable employee) {
        this.employee = employee;
        validateManagerSalary(getSalary());
    }

    @Override public int getId() { return employee.getId(); }
    @Override public String getName() { return employee.getName(); }
    @Override public int getAge() { return employee.getAge(); }
    @Override public double getSalary() { return employee.getSalary(); }
    @Override public String getEmail() { return employee.getEmail(); }

    @Override
    public void validateManagerSalary(double salary) {
        if (salary < MIN_MANAGER_SALARY) {
            throw new IllegalArgumentException("Минимальная зарплата менеджера должна быть не меньше " + MIN_MANAGER_SALARY);
        }
    }
}

