package week6.strategy;

public class SalariedStrategy implements ISalaryStrategy {


    private double hourlyRate;

    public SalariedStrategy(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary(int hours) {
        return hourlyRate * hours;
    }
}
