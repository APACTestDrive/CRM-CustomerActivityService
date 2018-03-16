package com.oracle.testdrive.crm;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;


@SuppressWarnings("oracle.jdeveloper.webservice.wsdl-impl-synchronization")
@WebService(name = "CustomerService", wsdlLocation = "WEB-INF/wsdl/CustomerServiceService.wsdl")
public class CustomerService {
    public CustomerService() {}

    @WebMethod
    public String addCustomerActivity(@WebParam(name = "customerId") String customerId,
                                      @WebParam(name = "activityName") String activityName,
                                      @WebParam(name = "activityDetail") String activityDetail,
                                      @WebParam(name = "activityDate") String activityDate) {
        int randomNum;
        int min = 10000;
        int max = 99999;
        String activityId = "";
        System.out.println("customerId is: " + customerId);
        System.out.println("activityName is: " + activityName);
        System.out.println("activityDetail is: " + activityDetail);
        System.out.println("activityDate is: " + activityDate);
        if (activityName != "" && activityName != null) {
            randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            activityId = customerId + "-" + String.valueOf(randomNum) + "-v1.0";
            System.out.println("activityId is: " + activityId);
        }
        
        return activityId;
    }
}
