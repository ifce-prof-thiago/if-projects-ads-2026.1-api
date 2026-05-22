package br.edu.ifce.mn.ads.ifproject.auth.core.security.service;

import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final IUserRepository repository;

    public CustomUserDetailsService(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String password = repository.findPasswordByLogin(username);

        return User
                .withUsername(username)
                .password(password)
                .authorities("USER") // aqui pode ser implementado um sistema de roles e authorities mais elaborado
                .build();
    }   
}
