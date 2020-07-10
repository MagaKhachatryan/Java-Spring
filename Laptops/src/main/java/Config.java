import Interfaces.OSfunctional;
import OS.Linux;
import OS.Windows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import laptop.*;

@Configuration
public class Config {
    @Bean
    public OSfunctional windowsOS(){return new Windows();}


    @Bean
    public Lenovo lenovoLaptopParam(OSfunctional osType)
    {return new Lenovo(osType); }



}
