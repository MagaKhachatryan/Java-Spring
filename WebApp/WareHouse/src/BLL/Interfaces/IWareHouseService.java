package BLL.Interfaces;

import Model.Material;
import Model.WareHouse;

import java.util.UUID;

public interface IWareHouseService extends IBaseService<Material> {
    boolean transactMaterial(Material material,WareHouse to);
    void addItem(Material material,double qauntity);

}
