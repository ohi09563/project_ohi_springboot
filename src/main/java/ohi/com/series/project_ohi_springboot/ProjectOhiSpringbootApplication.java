package ohi.com.series.project_ohi_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ProjectOhiSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectOhiSpringbootApplication.class, args);
    }

}
