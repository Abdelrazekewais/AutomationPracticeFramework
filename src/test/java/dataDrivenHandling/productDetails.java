package dataDrivenHandling;

public class productDetails {
    private String title;
    private String imgSource;
    private String price;
    private String total;
    private String quantity;
    private String billingSubtotal;
    private String billingTax;
    private String billingTotal;


    public void setBillingTax(String billingTax) {
        this.billingTax = billingTax;
    }

    public void setBillingSubtotal(String billingSubtotal) {
        this.billingSubtotal = billingSubtotal;
    }

    public void setBillingTotal(String billingTotal) {
        this.billingTotal = billingTotal;
    }




    public String getBillingSubtotal() {
        return billingSubtotal;
    }

    public String getBillingTax() {
        return billingTax;
    }

    public String getBillingTotal() {
        return billingTotal;
    }



    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

