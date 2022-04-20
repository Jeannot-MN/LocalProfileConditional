package com.example.localprofileconditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloServiceConfig {

    @Bean
    @Conditional(IsLocalProfile.class)
    public HelloService localHelloService(){
        return new LocalHelloService();
    }

    @Bean
    @Conditional(IsNotLocalProfile.class)
    public HelloService devHelloService(){
        return new DevHelloService();
    }
}
