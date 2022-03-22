public class Main {

    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("3219234604");
        AccountTransferEvent eventTwo = new AccountTransferEvent("16278928363");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("34039504358");

        Event[] events = {eventOne, eventTwo, eventThree};

        for (Event e : events) {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}
