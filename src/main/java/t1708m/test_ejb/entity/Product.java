package t1708m.test_ejb.entity;

public class Product {
    private long prodID;
    private String prodName;
    private String description;
    private long dateOfManf;
    private double price;

    public long getProdID() {
        return prodID;
    }

    public void setProdID(long prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDateOfManf() {
        return dateOfManf;
    }

    public void setDateOfManf(long dateOfManf) {
        this.dateOfManf = dateOfManf;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
