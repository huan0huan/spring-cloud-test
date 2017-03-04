package cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by admin on 2017/3/3.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerＣ {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerＣ.class, args);
    }

}
