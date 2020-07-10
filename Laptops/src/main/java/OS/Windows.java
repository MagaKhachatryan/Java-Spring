package OS;

import Interfaces.OSfunctional;

public class Windows implements OSfunctional {
    @Override
    public void readFile() {
        System.out.println("File is being read in Windows system");
    }

    @Override
    public void writeFile() {
        System.out.println("File is being written in Windows system");

    }

    @Override
    public void restart() {
        System.out.println("Computer  is being restarted in  Windows system");

    }
}
