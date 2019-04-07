package vs.usermanagement.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter
    @NotNull
    @Column(name = "name")
    @Size(min = 4, max = 45, message = "Name between 4 and 45 chars")
    private String name;

    @Email
    @Setter
    @NotNull
    @Column(name = "email")
    @Size(min = 4, max = 45, message = "Email between 4 and 45 chars")
    private String email;

    @Setter
    @NotNull
    @Column(name = "password")
    @Size(min = 3, max = 100, message = "Password between 4 and 100 chars")
    private String password;

    @Setter
    @NotNull
    @Column(name = "date_created")
    private LocalDateTime dateCreated;

}
