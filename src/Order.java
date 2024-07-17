import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private List<Item> items = new ArrayList<>();
    private double totalPrice;
    private double shippingCost = 10.0; // Default shipping cost

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void addItem(Item item) {
        items.add(item);
        totalPrice += item.getPrice();
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getItemCount() {
        return items.size();
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    @Override
    public String toString() {
        return "Order: " + items.size() + " items, Total: $" + totalPrice + ", Shipping: $" + shippingCost;
    }
}