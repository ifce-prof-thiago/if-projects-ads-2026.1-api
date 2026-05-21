import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifce.mn.ads.ifproject.users.domain.models.RegisterDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import br.edu.ifce.mn.ads.ifproject.auth.application.controllers.dtos.LoginDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.edu.ifce.mn.ads.ifproject.auth.core.security.JwtService;


@RestController
@RequestMapping("auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid LoginDTO data) { 

        var usernamePassword = new UsernamePasswordAuthenticationToken(
            data.email(), data.password()
            );

        var auth = authenticationManager.authenticate(usernamePassword);    
        
            var token = jwtService.generateToken(data.email());
            return ResponseEntity.ok(token);
    }
    
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDTO data) {
        //TODO: process POST request

        //utiliza o metodo encode do bcrypt para guardar a senha no repository
        
        return ResponseEntity.ok().build();
    }
    
}