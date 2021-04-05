package nika.securitypractice.service;

import lombok.RequiredArgsConstructor;
import nika.securitypractice.exception.EmailExistedException;
import nika.securitypractice.exception.NicknameExistedException;
import nika.securitypractice.exception.PasswordWrongException;
import nika.securitypractice.model.User;
import nika.securitypractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder     bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User registerUser(String email, String password, String nickname, String phone) throws NicknameExistedException {
        Optional<User> existed = userRepository.findByNickname(nickname);
        if(existed.isPresent()) {
            throw new NicknameExistedException(nickname);
        }

        String encodePassword = bCryptPasswordEncoder.encode(password);
        User user = User.builder()
                .email(email)
                .password(encodePassword)
                .nickname(nickname)
                .phone(phone)
                .build();

        return userRepository.save(user);
    }

/*    public User authenticate(String email, String password) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new EmailExistedException(email));
        if (!bCryptPasswordEncoder.matches(password, user.getPassword())) {
            throw new PasswordWrongException();
        }

        return user;
    }*/
}
