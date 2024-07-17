public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.attach(new PriceObserver());
        order.attach(new QuantityObserver());

        order.addItem(new Item("Item 1", 50));
        System.out.println(order);

        order.addItem(new Item("Item 2", 180));
        System.out.println(order);

        order.addItem(new Item("Item 3", 50));
        System.out.println(order);

        order.addItem(new Item("Item 4", 20));
        order.addItem(new Item("Item 5", 10));
        order.addItem(new Item("Item 6", 10));
        System.out.println(order);
    }
}