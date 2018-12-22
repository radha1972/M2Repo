package hello;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.PathSelectors;



@SpringBootApplication


@EnableDiscoveryClient
@EnableSwagger2
public class EmployeeApplication1 {
 public static void main(String[] args) {
  SpringApplication.run(EmployeeApplication1.class, args);
 }
 @Bean
 public Docket swaggerApi() {
  return new Docket(DocumentationType.SWAGGER_2)
   .select()
   .apis(RequestHandlerSelectors.basePackage("hello"))
   .paths(PathSelectors.any())
   .build()
   .apiInfo(new ApiInfoBuilder().version("1.0").title("Employee API").description("Documentation Employee API v1.0").build());
 }
 
}