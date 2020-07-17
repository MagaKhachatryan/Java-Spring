package BLL.Implementations;

import BLL.Interfaces.IWareHouseService;
import Model.Material;
import Model.WareHouse;
import Model.WareHouseMaterial;

import java.util.UUID;

public class WareHouseService implements IWareHouseService {

    WareHouse wareHouse;
    public WareHouseService(WareHouse wareHouse)
    {
        this.wareHouse=wareHouse;
    }

    @Override
    public void addItem(Material item) {
        boolean contains=false;
        for(int i=0;i<wareHouse.materials.size();++i)
        {
            if(wareHouse.materials.get(i).getMaterialID()==item.getID())
            {
                if(wareHouse.materials.get(i).getQuantity()<=item.getType().getMaxCapacity())
                {
                    wareHouse.materials.get(i).setQuantity(item.getType().getMaxCapacity());
                    contains=true;
                    break;
                }
            }
        }
        if(!contains)
        {
            wareHouse.materials.add(new WareHouseMaterial(item.getID(),wareHouse.getID(),item.getType().getMaxCapacity()));

        }

    }

    @Override
    public boolean deleteItem(Material item) {
        for(int i=0;i<wareHouse.materials.size();++i)
        {
            if(wareHouse.materials.get(i).getMaterialID()==item.getID())
            {
                wareHouse.materials.remove(i);
                return true;
            }
        }
        return false;


    }

    @Override
    public boolean transactMaterial(Material material, WareHouse to) {

        if(wareHouse.containsMaterial(material.getID())<=-1)
        {
            return false;
        }
       if(to.containsMaterial(material.getID())>=0) {
           int i=to.containsMaterial(material.getID());
           int j=wareHouse.containsMaterial(material.getID());
           if ((to.materials.get(i).getQuantity() + wareHouse.materials.get(j).getQuantity() < material.getType().getMaxCapacity())) {
               to.materials.get(i).setQuantity(to.materials.get(i).getQuantity() + wareHouse.materials.get(j).getQuantity());
           } else {
               to.materials.get(i).setQuantity(material.getType().getMaxCapacity());
           }
       }

        return true;

    }

    @Override
    public void addItem(Material material, double qauntity) {

    }


}
