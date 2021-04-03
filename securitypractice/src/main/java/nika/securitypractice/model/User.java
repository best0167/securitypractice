package nika.securitypractice.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class User {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;
    private String password;
    private String nickname;
    private String role; //ROLE_USER, ROLE_ADMIN
    /*     private String phone; */

    @CreationTimestamp
    private Timestamp REG_DATE;
/*    @UpdateTimestamp
    private Timestamp MOD_DATE;*/


    // OAuth를 위해 구성한 추가 필드 2개
    private String provider;
    private String providerId;

}
