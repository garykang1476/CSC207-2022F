package week6.strategy;

public class Employee {

    private String name;
    private ISalaryStrategy salaryStrategy;
    private int hours;

    public Employee(String name, ISalaryStrategy salaryStrategy) {
        this.name = name;
        this.salaryStrategy = salaryStrategy;
    }

    void logWorkHours(int hours){
        this.hours = hours + this.hours;

    }

    double getSalary(){
        return salaryStrategy.getSalary(hours);
    }

    void changeStrategy(ISalaryStrategy salaryStrategy){
        this.salaryStrategy = salaryStrategy;

    }


    public static void main(String[] args) {

        SalaryStrategyFactory ssf = new SalaryStrategyFactory();

        Employee gary = new Employee("Gary", ssf.getSalaryStrategy("Employee 1"));
        gary.logWorkHours(20);
        System.out.println(gary.getSalary());
        gary.changeStrategy(ssf.getSalaryStrategy("Employee 2"));
        System.out.println(gary.getSalary());
    }
}
