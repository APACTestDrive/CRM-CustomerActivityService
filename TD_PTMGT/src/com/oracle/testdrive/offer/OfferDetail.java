package com.oracle.testdrive.offer;

public class OfferDetail {
    
    String id;
    String name;
    String points;
    String message;
    String productid;
    String productname;
    String productprice;
    String productimage;
    String productdesc;


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getPoints() {
        return points;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage;
    }

    public String getProductimage() {
        return productimage;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductid() {
        return productid;
    }
    
    @Override
    public String toString() {
        return "OfferDetail [id=" + id + ", name=" + name + ", points=" + points + ", message=" + message + ", productid=" + productid + ", productname=" + productname + ", productprice=" + productprice + ", productimage=" + productimage + ", productdesc=" + productdesc + "]";
    }
}
