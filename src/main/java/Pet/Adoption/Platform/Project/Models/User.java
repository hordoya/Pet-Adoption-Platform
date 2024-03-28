//package Pet.Adoption.Platform.Project.Models;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//
//import java.time.LocalDate;
//import java.util.Arrays;
//import java.util.Collection;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "Customer")
//public class User implements UserDetails {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @NotBlank(message = "Username is required")
//    private String name;
//    @NotBlank(message = "Email is required")
//    @Email()
//    private String email;
//    @NotBlank(message = "Password is required")
//    @Size(min = 8)
//    private String password;
//    @NotNull(message = "Birthday is required")
//    @Past(message = "Birthday must be in the past")
//    private LocalDate birthday;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//    }
//
//    @Override
//    public String getUsername() {
//        return name;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
////    private LocalDate birthday;
//
//}
package Pet.Adoption.Platform.Project.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "Customer")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private LocalDate birthday;
    private boolean enabled;

}
