package nika.securitypractice.repository;

import nika.securitypractice.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("회원가입 테스트")
    void create() throws Exception{
        // given
        User user = new User();

        user.setSeq(1L);
        user.setEmail("best0167@naver.com");
        user.setPassword("1234");
        user.setNickname("프레임");
        user.setPassword("01033331111");


        // when
        /*Long joinId =
*/
        // then
        /*assertEquals(user.getId());*/
    }

}