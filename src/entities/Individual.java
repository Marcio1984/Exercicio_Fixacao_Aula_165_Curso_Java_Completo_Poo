package entities;

public class Individual extends TaxPayer {

    private Double healthcareExpenses;

    public Individual(){
    }

    public Individual(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    public Individual(String name, Double annualIncome, Double healthcareExpenses) {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public double taxCalculation() {
        double tax = 0.f;
        if (getAnnualIncome() < 20000.00){
            tax = getAnnualIncome() * 15/100 - healthcareExpenses * 50/100;
        } else {
            tax = getAnnualIncome() * 25/100 - healthcareExpenses * 50/100;
        }
        return tax;
    }

}
