package prev;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivanov I.F", "manager", "Ivanov@mail.ru", "G123", 1245.25, 54),
                new Employee("Petrov I.S", "courier", "Petrov@bk.ru", "F12", 524.34, 19),
                new Employee("Sidorova E.P", "accountant", "S@mail.ru", "A15", 1625.32, 35)
        };
        PrintFiltr(employees,40);
    }
        static void PrintFiltr ( Employee[]employees,int age){
            for (int i = 0; i < employees.length; i++) {
                if(employees[i].getAge() > age){
                    employees[i].printInfo();
                }

            }

        }
    }





