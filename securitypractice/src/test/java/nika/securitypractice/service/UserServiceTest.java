package nika.securitypractice.service;

import nika.securitypractice.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    EntityManager entityManager;
    
    @Test
    @DisplayName("")
    void test() throws Exception {
        // given
        
        // then
        
        // then
        
        
    }

}