package src;

public class MySQLEmployeeRepository implements IEmployeeRepository{
    @Override
    public boolean isConnected() {
        return true;
    }

    @Override
    public void save(Employee emp) {
        // реализация сохранения в MySQL
    }

    @Override
    public boolean existsById(int id) {
        // проверка существования сотрудника
        return false;
    }
}
