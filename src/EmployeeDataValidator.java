package src;

public class EmployeeDataValidator {

    public void validate(IEmployeeData data) {
        if (data.getAge() < 18) {
            throw new IllegalArgumentException("Возраст должен быть не меньше 18 лет");
        }
        if (data.getSalary() < 0) {
            throw new IllegalArgumentException("Зарплата должна быть выше 0");
        }
        if (data.getEmail() != null && !data.getEmail().contains("@")) {
            throw new IllegalArgumentException("Некорректный формат данных");
        }
    }

}

