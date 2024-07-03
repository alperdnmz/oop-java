public class Main {
    public static void main(String[] args) {

        /*BaseCreditManager creditManager1 = new StudentCreditManager();
        System.out.println(creditManager1.creditCalculate(1000));
        BaseCreditManager creditManager2 = new TeacherCreditManager();
        System.out.println(creditManager2.creditCalculate(1000));*/

        BaseCreditManager [] baseCreditManagers = new BaseCreditManager[]{
                new SoldierCreditManager(),
                new StudentCreditManager(),
                new TeacherCreditManager() };

        for(BaseCreditManager creditManager : baseCreditManagers){
            System.out.println(creditManager.creditCalculate(1000.0));
        }
    }
}