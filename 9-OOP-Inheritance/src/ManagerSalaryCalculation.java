public class ManagerSalaryCalculation extends BaseSalaryCalculation {
    public ManagerSalaryCalculation() {
        super(1000,300);
    }

    @Override
    public void salaryCalculation() {
        this.salary = (this.salary*ratio/20);
        System.out.println("Manager Salary: " + this.salary);
    }
}
