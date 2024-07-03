public class EngineerSalaryCalculation extends BaseSalaryCalculation{
    public EngineerSalaryCalculation() {
        super(1000,200);
    }

    @Override
    public void salaryCalculation() {
        this.salary = (this.salary*ratio/20);
        System.out.println("Engineer Salary: " + this.salary);
    }
}
