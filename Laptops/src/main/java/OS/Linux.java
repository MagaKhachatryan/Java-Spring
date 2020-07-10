package OS;

import Interfaces.OSfunctional;

public class Linux implements OSfunctional {
    @Override
    public void readFile() {
        System.out.println("File is being read in Linux system");
    }

    @Override
    public void writeFile() {
        System.out.println("File is being written in Linux system");

    }

    @Override
    public void restart() {
        System.out.println("Computer  is being restarted in  Linux system");

    }
}
