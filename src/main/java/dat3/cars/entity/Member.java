package dat3.cars.entity;

import dat3.security.entity.UserWithRoles;
import org.springframework.security.core.userdetails.User;

import javax.persistence.Entity;


@Entity
public class Member extends UserWithRoles{

    String firstName;

    public Member(String user, String password, String email, String firstName) {
        super(user, password, email);
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Member() {
    }
}
