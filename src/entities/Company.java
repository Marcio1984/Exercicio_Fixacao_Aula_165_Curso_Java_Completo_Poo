package entities;

public class Company extends TaxPayer{

    private Integer employees;

    public Company(){
    }

    public Company(Integer employees) {
        this.employees = employees;
    }

    public Company(String name, Double annualIncome, Integer employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public double taxCalculation() {
        double tax = 0.f;
        if (employees > 10){
            tax = getAnnualIncome() * 14/100;
        } else {
            tax = getAnnualIncome() * 16/100;
        }
        return tax;
    }
}
