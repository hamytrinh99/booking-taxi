/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class Price {
    private String idDistrict;
    private String idTypeVehicle;
    private String idPrice;
    private String price;

    public String getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(String idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getIdTypeVehicle() {
        return idTypeVehicle;
    }

    public void setIdTypeVehicle(String idTypeVehicle) {
        this.idTypeVehicle = idTypeVehicle;
    }

    public String getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(String idPrice) {
        this.idPrice = idPrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
