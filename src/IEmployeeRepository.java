package src;

// Интерфейс для работы с БД

public interface IEmployeeRepository {
    boolean isConnected();
    void save(Employee emp);
    boolean existsById(int id);
}
