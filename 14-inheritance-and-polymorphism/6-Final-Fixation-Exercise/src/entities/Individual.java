package entities;

public class Individual extends Person
{
    private Double healthExpenditure;

    public Individual()
    {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditure)
    {
        super(name, annualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    public Double getHealthExpenditure()
    {
        return healthExpenditure;
    }

    public void setHealthExpenditure(Double healthExpenditure)
    {
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public Double taxesPayed()
    {
        if (getAnnualIncome() < 20000.00)
        {
            return getAnnualIncome() * 0.15 - (getHealthExpenditure() * 0.50);
        }
        else
        {
            return getAnnualIncome() * 0.25 - (getHealthExpenditure() * 0.50);
        }
    }
}
