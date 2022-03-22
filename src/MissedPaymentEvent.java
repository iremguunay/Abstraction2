import java.sql.Timestamp;

public class MissedPaymentEvent implements Event {

    private final Long createdTimestamp;
    private final String id;

    public MissedPaymentEvent(String id) {
        this.createdTimestamp = new Timestamp(System
                .currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " missed their payment. " +
                "Sending a bill to the customer.");
    }
}
