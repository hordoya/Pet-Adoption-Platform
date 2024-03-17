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
//    private LocalDate birthday;

}
