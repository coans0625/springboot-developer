package me.limchaemoon.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.limchaemoon.springbootdeveloper.domain.RefreshToken;
import me.limchaemoon.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpectd token"));
    }
}
