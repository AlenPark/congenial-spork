import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jiangchuan.deng on 2018/7/14.
 */
@SpringBootApplication
@ComponentScan({"controller","service","dao.mapper"})
@MapperScan("dao.mapper")
public class SpringBoot2TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2TestApplication.class, args);
    }
}
