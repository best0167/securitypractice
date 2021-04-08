package nika.securitypractice.service;

import lombok.RequiredArgsConstructor;
import nika.securitypractice.model.User;
import nika.securitypractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

/*    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }*/

    @Transactional
    public Long join(User user) {
        validateDuplicateUser(user);
        userRepository.save(user);

        return user.getSeq();
    }

    private void validateDuplicateUser(User user) {
        List<User> findUsers = userRepository.findByNickname(user.getNickname());
        if (!findUsers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 닉네임입니다");
        }

    }

    /*    public User registerUser(String email, String password, String nickname, String phone) throws NicknameExistedException {
        Optional<User> existed = userRepository.findByNickname(nickname);
        if(existed.isPresent()) {
            throw new NicknameExistedException(nickname);
        }

        String encodePassword = bCryptPasswordEncoder.encode(password);
        User user = new User();

        user.setEmail(email);
        user.setPassword(encodePassword);
        user.setNickname(nickname);
        user.setPhone(phone);
        user.setRole("ROLE_USER");

        return userRepository.save(user);
    }*/


/*    public User authenticate(String email, String password) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new EmailExistedException(email));
        if (!bCryptPasswordEncoder.matches(password, user.getPassword())) {
            throw new PasswordWrongException();
        }

        return user;
    }*/
}
