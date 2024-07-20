package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order
{
    // SimpleDateFormat for date right now and birthday outputs
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdfMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client = new Client();
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(){}

    public Order(Date moment, OrderStatus status, Client client)
    {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment()
    {
        return moment;
    }

    public void setMoment(Date moment)
    {
        this.moment = moment;
    }

    public OrderStatus getStatus()
    {
        return status;
    }

    public void setStatus(OrderStatus status)
    {
        this.status = status;
    }

    public List<OrderItem> getOrderItems()
    {
        return orderItems;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    public void addItem(OrderItem orderItem)
    {
        orderItems.add(orderItem);
    }
    public void removeItem(OrderItem orderItem)
    {
        orderItems.remove(orderItem);
    }

    // Calculating total value for the order (all subtotals)
    public Double total()
    {
        double sum = 0; // Initializing sum
        for (OrderItem orderItem : orderItems)
        {
            sum += orderItem.subTotal(); // Adding subtotal to sum for each orderItem
        }
        return sum;
    }

    // StringBuilder and its weird stuff (is it really more memory efficient?)
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY:\n");
        sb.append("Order moment: ");
        sb.append(sdfMoment.format(moment));
        sb.append("\nOrder status: ");
        sb.append(status);
        sb.append("\nClient: ");
        sb.append(client.getName()).append(" (").append(sdf.format(client.getBirthDate())).append(") - ").append(client.getEmail());
        sb.append("\nOrder items:\n");

        for (OrderItem orderItem : orderItems)
        {
            sb.append(orderItem).append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));
        return sb.toString();
    }
}
