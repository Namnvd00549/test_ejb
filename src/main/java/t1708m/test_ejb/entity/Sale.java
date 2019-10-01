package t1708m.test_ejb.entity;

public class Sale {
    private long s1No;
    private String salesmanID;
    private String ProdID;
    private String salesmanName;
    private String dos;

    public long getS1No() {
        return s1No;
    }

    public void setS1No(long s1No) {
        this.s1No = s1No;
    }

    public String getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(String salesmanID) {
        this.salesmanID = salesmanID;
    }

    public String getProdID() {
        return ProdID;
    }

    public void setProdID(String prodID) {
        ProdID = prodID;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }
}
