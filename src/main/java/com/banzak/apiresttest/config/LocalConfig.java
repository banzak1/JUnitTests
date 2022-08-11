package com.banzak.apiresttest.config;

import com.banzak.apiresttest.model.User;
import com.banzak.apiresttest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configurable
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDb() {
        User u1 = new User(null, "Leonardo", "leosantanabr@gmail.com", "123");
        User u2 = new User(null, "Jessica", "jessy_souzza@gmail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }

}
