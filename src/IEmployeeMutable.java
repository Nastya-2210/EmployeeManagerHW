package src;
//Интерфейс для изменения данных сотрудника

public interface IEmployeeMutable extends IEmployeeData{
    void setId(int id);
    void setName(String name);
    void setAge(int age);
    void setSalary(double salary);
    void setEmail(String email);
}
