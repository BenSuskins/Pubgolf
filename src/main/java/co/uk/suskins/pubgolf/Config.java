package co.uk.suskins.pubgolf;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"co.uk.suskins.pubgolf"})
@EntityScan(basePackages = {"co.uk.suskins.pubgolf.*"})
@EnableJpaRepositories(basePackages = {"co.uk.suskins.pubgolf."})
@EnableAutoConfiguration
public class Config {
}
