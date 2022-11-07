package week6.strategy;

public class ContractSalaryStrategy implements ISalaryStrategy{


    private double minimumPay;

    private double minimumHours;



    private double hourlyRate;


    public ContractSalaryStrategy(double minimumPay, double minimumHours, double hourlyRate) {
        this.minimumPay = minimumPay;
        this.minimumHours = minimumHours;
        this.hourlyRate = hourlyRate;
    }



    @Override
    public double getSalary(int hours) {
        if (minimumHours >= hours){
            return minimumPay;
        }
        else{
            return minimumPay + (hours - minimumHours) * hourlyRate;
        }
    }
}
