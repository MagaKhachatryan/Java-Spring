package Model;
import sun.misc.UUEncoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
public class Material {

    private UUID ID;//when designing real DB it will be easy to have unique Id due to a simple annotation
    private String name;
    private MaterialType type;//it will be just ID when designing real DB

    public ArrayList<WareHouseMaterial> warehouses=new ArrayList<>();

    public Material(String name,MaterialType type )
    {
        this.ID=UUID.randomUUID();
        this.name=name;
        this.type=type;
    }

    public UUID getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaterialType getType(){
        return this.type;
    }

    public void setType(MaterialType type) {
        this.type = type;
    }
}
