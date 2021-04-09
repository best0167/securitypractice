package nika.securitypractice.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@ToString(of = {"seq", "email", "password", "nickname", "phone"})
public class User {


    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    private String email;
    private String password;

    @Column(name="nickname", unique = true)
    private String nickname;

    private String role; //ROLE_USER, ROLE_ADMIN
    private String phone;

    @CreationTimestamp
    private Timestamp REG_DATE;
    @UpdateTimestamp
    private Timestamp MOD_DATE;

    public User(Long seq, String email, String password, String nickname, String phone) {
        this.seq = seq;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.phone = phone;
    }

    public User() {

    }


    // OAuth를 위해 구성한 추가 필드 2개
/*    private String provider;
    private String providerId;*/

}
