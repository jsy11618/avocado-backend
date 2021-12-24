package avocado.ecommercebackend.user.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String userName;
    private String userPassword;
    private String userPhone;
    private String userEmail;
    private String userAddress;
    private String userBirth;
    private String userZipcode;
    private String created;

}