import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = {
        "entity",
        "enums",
        "config"
})
@PropertySource("classpath:/application.properties")
@EntityScan({"entity", "entity"})
public class CumaCustomaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CumaCustomaryApplication.class, args);
    }

}
