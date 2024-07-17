public class PriceObserver extends OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            double discount = 20.0;
            order.setTotalPrice(order.getTotalPrice() - discount);
            System.out.println("Applied $20 discount. New total: $" + order.getTotalPrice());
        }
    }
}