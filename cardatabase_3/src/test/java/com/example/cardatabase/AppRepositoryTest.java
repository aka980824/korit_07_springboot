package com.example.cardatabase;

import com.example.cardatabase.domain.AppUser;
import com.example.cardatabase.domain.AppUserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class AppRepositoryTest {

    @Autowired
    private AppUserRepository appUserRepository;

    @Test
    @DisplayName("findByUsername 메서드 검증 테스트")
    public void findUserName() {
        // given
        AppUser user = new AppUser("user1", "password", "USER");
        appUserRepository.save(user);
        // when
        Optional<AppUser> user1 = appUserRepository.findByUsername("user1");
        // then
        assertThat(user1.isPresent()).isTrue();
        assertThat(user1.get().getUsername()).isEqualTo("user1");
        assertThat(user1.get().getRole()).isEqualTo("USER");
    }
}
