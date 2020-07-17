package BLL.Implementations;

import BLL.Interfaces.ISandshipService;
import Model.Sandship;
import Model.WareHouse;

public class SandshipService implements ISandshipService {
    private Sandship sandshipModel;

    public SandshipService(Sandship sandshipModel)
    {
        this.sandshipModel=sandshipModel;
    }
    @Override
    public void addItem(WareHouse item) {
        if(!sandshipModel.wareHouses.contains(item))
        {
            this.sandshipModel.wareHouses.add(item);

        }

    }

    @Override
    public boolean deleteItem(WareHouse item) {
        if(this.sandshipModel.wareHouses.contains(item))
        {
            this.sandshipModel.wareHouses.remove(item);
            return true;

        }
        return false;
    }
}
