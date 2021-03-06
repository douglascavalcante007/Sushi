package br.com.delivery.api;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "br.com.delivery.api")
public class DeliveryApplication implements CommandLineRunner {

    public static void main(final String[] args) {
        SpringApplication.run(DeliveryApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

    }
}
