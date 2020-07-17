package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class WareHouse {
private UUID ID;
private Sandship sandship;
public ArrayList<WareHouseMaterial> materials=new ArrayList<>();

    WareHouse(Sandship sandship) {
        this.ID=UUID.randomUUID();
        this.sandship=sandship;
    }

    public UUID getID() {
        return ID;
    }

    public Sandship getSandship() {
        return sandship;
    }


    public  int containsMaterial(UUID id){
        for(int i=0;i<this.materials.size();++i)
        {
            if(this.materials.get(i).getMaterialID()==id)
                return  i;
        }
        return -1;
    }
}
