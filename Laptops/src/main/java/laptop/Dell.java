package laptop;

import Interfaces.laptop;
import Interfaces.OSfunctional;

public class Dell implements laptop {
    private OSfunctional osType;

    public Dell(OSfunctional osType)
    {
        this.osType=osType;
    }

    public Dell()
    {

    }


    public OSfunctional getOs(){return  this.osType;}
    public void setOs(OSfunctional osType){ this.osType=osType;}


    @Override
    public boolean isFromMetal() {
        System.out.println("Dell's isFromMetal function");
        return true;
    }

    @Override
    public String ProduceCountry() {
        System.out.println("Dell's ProduceCountry function");
        return "US";
    }
}
