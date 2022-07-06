public class Main {
    public static void countMinSalary(Employee[] employees) {
        if (employees.length >0) {
            Employee emp = employees [0];
            for (Employee employee : employees
            ) {
                if (emp.getSalaryStaff() > employee.getSalaryStaff())
                    emp = employee;
            }
            System.out.println("Сотрудник с минимальной зарплатой:"+ emp.getSalaryStaff()+ emp.getFio()+emp.getId());
        } else
            System.out.println("Массив пустой");

    }
    public static void countMaxSalary (Employee [] employees) {
         if (employees.length >0) {
            Employee emp = employees [0];
            for (Employee employee : employees
            ) {
                if (emp.getSalaryStaff() < employee.getSalaryStaff())
                    emp = employee;
            }
            System.out.println("Сотрудник с максимальной зарплатой:"+ emp.getSalaryStaff()+ emp.getFio()+emp.getId());
        } else
            System.out.println("Массив пустой");
    }
    public static void typeAllStaff (Employee [] employees) {
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }

    public static int countStaffSalary ( Employee[]employees) {
        int sum =0;
        for (Employee employee: employees ){
            sum += employee.getSalaryStaff();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: "+ sum);
        return sum;
    }
    public static void averageSalary (Employee [] employees) {
        int sum = countStaffSalary (employees);
        int average = sum/employees.length;
        System.out.println("Средняя зарплата "+average);
    }

    public static void main (String [] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov",9000,10);
        employee [1] = new Employee("Petrov", 15000, 11);
        employee[2] = new Employee("Alex",12000,10);
        employee[3] = new Employee("Fedorov",14000,10);
        employee[4] = new Employee("Krasnov",15000,10);
        employee [5] = new Employee("Zhdanov", 16000, 11);
        employee[6] = new Employee("Veselov",10000,10);
        employee[7] = new Employee("Korolonko",10000,10);
        employee[8] = new Employee("Vodonayev",10000,10);
        employee[9] = new Employee("Pupkin",10000,10);
employee [9].setDepartmentNumber(2);
employee [8].setSalaryStaff(80000);
     countStaffSalary(employee);
     countMaxSalary(employee);
     countMinSalary(employee);
     averageSalary(employee);
     typeAllStaff(employee);

    }



}