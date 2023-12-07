package ie.atu.wtcuserservice;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    @NotBlank(message = "Name cannot be blank")
    @Size(min=2, max=50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message= "UserId cannot be blank")
    private String userId;

    @Email(message = "Invalid email address")
    private String email;
}
