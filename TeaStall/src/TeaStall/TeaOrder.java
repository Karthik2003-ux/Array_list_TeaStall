package TeaStall;

public class TeaOrder {

    private int orderId;
    private String customerName;
    private String teaType;
    private int quantity;
    private String email;

    public TeaOrder() {}

    public TeaOrder(int orderId, String customerName, String teaType, int quantity, String email) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.teaType = teaType;
        this.quantity = quantity;
        this.email = email;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Order ID: " + orderId +
               " | Customer Name: " + customerName +
               " | Tea Type: " + teaType +
               " | Quantity: " + quantity +
               " | Email: " + email + "\n";
    }
}