public class QuantityObserver extends OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getItemCount() > 5) {
            order.setShippingCost(0);
            System.out.println("Free shipping applied.");
        } else {
            order.setShippingCost(10);
            System.out.println("Standard shipping cost of $10 applied.");
        }
    }
}