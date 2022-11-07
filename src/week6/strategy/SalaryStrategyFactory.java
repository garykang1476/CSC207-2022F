package week6.strategy;

public class SalaryStrategyFactory {

    public ISalaryStrategy getSalaryStrategy(String strategyName){
        if (strategyName == null){
            return null;
        }
        if (strategyName.equals("Employee 1")){
            return new SalariedStrategy(50);
        }
        else if (strategyName.equals("Contractor 1")){
            return new ContractSalaryStrategy(2000, 40, 50);
        }
        else if (strategyName.equals("Contractor 2")){
            return new ContractSalaryStrategy(4000, 80, 50);

        }
        return null;
    }
}
