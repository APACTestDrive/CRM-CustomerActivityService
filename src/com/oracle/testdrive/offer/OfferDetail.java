package com.oracle.testdrive.offer;

public class OfferDetail {
    
    String offerid;
    String offername;
    String points;
    String message;
    String productname;
    String productprice;
    String productimage;
    String productdesc;
    String productid;


    public void setOfferid(String offerid) {
        this.offerid = offerid;
    }

    public String getOfferid() {
        return offerid;
    }

    public void setOffername(String offername) {
        this.offername = offername;
    }

    public String getOffername() {
        return offername;
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
        return "OfferDetail [offerid=" + offerid + ", offername=" + offername + ", points=" + points + ", message=" + message + ", productname=" + productname + ", productprice=" + productprice + ", productimage=" + productimage + ", productdesc=" + productdesc + ", productid=" + productid + "]";
    }
}
