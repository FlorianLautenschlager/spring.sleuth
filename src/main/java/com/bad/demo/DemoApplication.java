package com.bad.demo;

import feign.Feign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //Remove me to run  without errors.
    @Import(FeignClientsConfiguration.class)
    class FooController {

        /**
         * @param builder outsch
         */
        public FooController(Feign.Builder builder) {
        }
    }
}

