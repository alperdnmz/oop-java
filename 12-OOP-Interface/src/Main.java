public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(16);
        customer1.setCustomerNumber(1606);
        customer1.setFirstName("Charles");
        customer1.setLastName("LECLERC");
        customer1.setAge(26);

        Customer customer2 = new Customer(5, 0512,"Sebastian", "VETTEL", 35);

//        ILogger Logger1 = new DatabaseLogger();
//        ILogger Logger2 = new SmsLogger();

        ILogger [] loggers = {new EmailLogger(), new DatabaseLogger(), new SmsLogger()};

        CustomerManager customerManagerDB = new CustomerManager(loggers);
        customerManagerDB.add(customer1);
        CustomerManager customerManagerSMS = new CustomerManager(loggers);
        customerManagerSMS.add(customer2);
    }
}