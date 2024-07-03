public class BaseSalaryCalculation {
    public int salary;
    public int ratio;

    public BaseSalaryCalculation() {}

    public BaseSalaryCalculation(int salary, int ratio) {
        this.salary = salary;
        this.ratio = ratio;
    }

    public void salaryCalculation() {
        this.salary = (this.salary*ratio/20);
        System.out.println("Salary Calculation: " + this.salary);
    }
}
