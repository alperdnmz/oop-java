public class CustomerManager {

    ILogger [] loggers; // dependency -composition

    public CustomerManager(ILogger [] loggers1) { //dependency logger
        this.loggers = loggers1;
    }

    public void add(Customer customer) {
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " added to database");

        //this.logger.log();

        for(ILogger logger: this.loggers){
            logger.log();
        }
    }
}
