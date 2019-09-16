package annotation.based.config.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MovieConfiguration {
    @Primary
    @Bean
    public MovieCatalog firstMovieCatalog() {
        return new FirstMovieCatalog();
    }
    @Bean
    public MovieCatalog secondMovieCatalog() {
        return new SecondMovieCatalog();
    }
}
