package src;

//Базовый класс сотрудника

public class Employee implements IEmployeeMutable {
        private int id;
        private String name;
        private int age;
        private double salary;
        private String email;

        public Employee() {
            setId(id);
            setName(name);
            setAge(age);
            setSalary(salary);
            setEmail(email);
        }

        @Override public int getId() {return id;}
        @Override public String getName() {return name;}
        @Override public int getAge() {return age;}
        @Override public double getSalary() {return salary;}
        @Override public String getEmail() {return email;}

        @Override public void setId(int id) {this.id = id;}
        @Override public void setName(String name) {this.name = name;}

        @Override
        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public void setEmail(String email) {
            this.email = email;
        }
    }

