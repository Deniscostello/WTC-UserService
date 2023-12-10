package ie.atu.wtcuserservice;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")

@NoArgsConstructor
public class User {
    @Id
    private ObjectId id;

    @NotBlank(message = "Name cannot be blank")
    @Size(min=2, max=50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message= "UserId cannot be blank")
    private String userId;

    @Email(message = "Invalid email address")
    private String email;
}
