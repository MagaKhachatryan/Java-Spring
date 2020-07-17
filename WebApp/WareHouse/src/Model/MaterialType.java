package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MaterialType {

    private UUID ID;
    private typeName name;
    private String description;
    private String icon;
    private double maxCapacity;

    public ArrayList<Material> materials=new ArrayList<Material>();




    MaterialType(typeName name,String description,String icon, double maxCapacity) {
        this.ID=UUID.randomUUID();
        this.name=name;
        this.description=description;
        this.icon=icon;
        this.maxCapacity=maxCapacity;
    }

    public UUID getID() {
        return ID;
    }

    public typeName getName() {
        return name;
    }

    public void setName(typeName name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;

    }
    public void setDescription(String description) {
        this.description=description;
    }

    public String getIcon(){
        return this.icon;
    }

    public void setIcon(String icon){
        this.icon=icon;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
