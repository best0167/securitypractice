package nika.securitypractice.repository;

import nika.securitypractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// CRUD 함수를 JpaRepository 가 들고 있음.
// @Repository 라는 어노테이션이 없어도 IoC된다. 이유는 JpaRepository 를 상속했기 때문
public interface UserRepository extends JpaRepository<User, Integer> {

    // findBy 규칙 -> Username 문법
    // select * from user where username = ?
    User findByEmail(String email);  // jpa Query methods

    /*// select * from user where email = ?
    public User findByEmail();*/

    List<User> findByNickname(String nickname);


}
