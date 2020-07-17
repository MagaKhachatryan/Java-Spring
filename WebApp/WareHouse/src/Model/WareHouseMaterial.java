package Model;

import java.util.UUID;

public class WareHouseMaterial {
    private UUID materialID;
    private  UUID wareHouseID;
    private double quantity;

    public WareHouseMaterial(UUID materialID,UUID wareHouseID,double quantity)
    {
        this.materialID=materialID;
        this.wareHouseID=wareHouseID;
        this.quantity=quantity;
    }

    public UUID getMaterialID() {
        return materialID;
    }

    public UUID getWareHouseID() {
        return wareHouseID;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
