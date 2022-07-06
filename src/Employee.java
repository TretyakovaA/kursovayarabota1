public class Employee {
    private String fio;
    private int salaryStaff;
    private int departmentNumber;
    private int id;
    private static int counter;
    static {
        counter = 1;
    }

    public Employee (String fio, int salaryStaff, int departmentNumber) {
        this.fio = fio;
        this.salaryStaff = salaryStaff;
        this.departmentNumber = departmentNumber;
        id = counter++;


    }

    public String getFio () {
        return fio;
    }

    public int getId() {
        return this.id++;
    }
public int getSalaryStaff () {return salaryStaff;}
    public int getDepartmentNumber () {return departmentNumber;}

    @Override
    public String toString() {
        return id +fio + salaryStaff+ departmentNumber;

    }

    public void setSalaryStaff(int salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }



}

