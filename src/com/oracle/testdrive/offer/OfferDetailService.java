package com.oracle.testdrive.offer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.sql.DataSource;
import java.sql.ResultSet;
import javax.naming.*;

@Path("/offer")
public class OfferDetailService {
    public OfferDetailService() {
    }

    @GET
    @Path("/{offerid}")
    @Produces(MediaType.APPLICATION_JSON)
    public OfferDetail getData(@PathParam("offerid") String offerid) {
        OfferDetail offerdetail = new OfferDetail();
        try {
            DataSource ds = (DataSource) new InitialContext().lookup("jdbc/loyaltyDS");
            ResultSet rs = ds.getConnection().createStatement().executeQuery("SELECT offers.id, offers.offername, offers.points, offers.message, product.productname, product.productprice, product.productimage, product.productdesc, offers.productid FROM offers, product WHERE offers.id = " + offerid + " AND product.id = offers.productid");
            while(rs.next()) {
                offerdetail.setId(offerid);
                offerdetail.setName(rs.getString("OFFERNAME"));
                offerdetail.setPoints(rs.getBigDecimal("POINTS").toString());
                offerdetail.setMessage(rs.getString("MESSAGE"));
                offerdetail.setProductid(rs.getBigDecimal("PRODUCTID").toString());
                offerdetail.setProductname(rs.getString("PRODUCTNAME"));
                offerdetail.setProductprice(rs.getBigDecimal("PRODUCTPRICE").toString());
                offerdetail.setProductimage(rs.getString("PRODUCTIMAGE"));
                offerdetail.setProductdesc(rs.getString("PRODUCTDESC"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return offerdetail;
    }
}
