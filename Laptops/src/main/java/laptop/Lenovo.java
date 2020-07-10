package laptop;

import Interfaces.laptop;
import Interfaces.OSfunctional;

public class Lenovo implements laptop {
    private OSfunctional osType;

    public Lenovo(OSfunctional osType)
    {
        this.osType=osType;
    }

    public Lenovo()
    {

    }

    public OSfunctional getOs(){return  this.osType;}
    public void setOs(OSfunctional osType){ this.osType=osType;}

    @Override
    public boolean isFromMetal() {
        System.out.println("Lenovo's isFrommetal function");
        return false;
    }

    @Override
    public String ProduceCountry() {
        System.out.println("Lenovo's isFromMetal function");
        return "China";
    }
}
