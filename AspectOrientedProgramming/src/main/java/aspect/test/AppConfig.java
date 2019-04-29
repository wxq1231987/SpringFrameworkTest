package aspect.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AppConfig {
    @Bean(name="dancer")
    public Dancer dancer() {
        return new Dancer();
    }
    @Bean(name="track")
    public Track track() {
        return new Track();
    }
}
