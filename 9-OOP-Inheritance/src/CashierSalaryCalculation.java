public class CashierSalaryCalculation extends BaseSalaryCalculation{
    public CashierSalaryCalculation() {
        super(1000,100);
    }

    @Override
    public void salaryCalculation() {
        this.salary = (this.salary*ratio/20+500);
        System.out.println("Cashier Salary: " + this.salary);
    }
}
