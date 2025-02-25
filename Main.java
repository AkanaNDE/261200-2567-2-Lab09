public class Main {
    public static void main(String[] args) {
        Shape rec = new Rectangle(4,4);
        Shape cir = new Circle(4);
        Shape ell = new Ellipse(5,5);

        AreaCalculator cal = new AreaCalculator();

        System.out.println(rec.calculateArea());
        System.out.println(cal.calculateArea(cir));
        System.out.println(cal.calculateArea(rec));
        System.out.println(cal.calculateArea(ell));



        Moveable bob = new Penguin();
        Moveable bee = new ostrich();
        Moveable ban = new Sparrow();
        Moveable bon = new eagle();

        bob.move();
        bee.move();
        ban.move();
        bon.move();

        if (ban instanceof Flyable) {
            ((Flyable) ban).fly();
        }

        if (bon instanceof Flyable) {
            ((Flyable) bon).fly();
        }


        NotificationService email = new EmailNotifier();
        NotificationService sms = new SMSNotifier();

        OrderProcessor emailOrderProcessor = new OrderProcessor(email);
        OrderProcessor smsOrderProcessor = new OrderProcessor(sms);

        Order order = new Order("01","Fish",2);

        emailOrderProcessor.processOrder(order);
        smsOrderProcessor.processOrder(order);

    }
}

