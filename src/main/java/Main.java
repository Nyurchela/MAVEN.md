public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = false;
        service.calculate(amount, registered);
    }
}
