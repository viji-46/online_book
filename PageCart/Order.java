package prc;

public class Order {
    private String orderId;
    private Book bookDetails;
    private double totalPrice;
    private String orderedBy;
    private Long date;
    private Long createdAt;
    private Status status;

    public enum Status {
        PENDING,
        CONFIRMED,
        PROCESSING,
        SHIPPED,
        OUT_FOR_DELIVERY,
        DELIVERED,
        CANCELLED,
        RETURNED
    }


    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    public Book getBookDetails() {
        return bookDetails;
    }
    public void setBookDetails(Book bookDetails) {
        this.bookDetails = bookDetails;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public String getOrderedBy() {
        return orderedBy;
    }
    public void setOrderedBy(String orderedBy) {
        this.orderedBy = orderedBy;
    }


    public Long getDate() {
        return date;
    }
    public void setDate(Long date) {
        this.date = date;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}




