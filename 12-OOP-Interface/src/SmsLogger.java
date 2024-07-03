public class SmsLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("SMS has been sent");
    }
}
