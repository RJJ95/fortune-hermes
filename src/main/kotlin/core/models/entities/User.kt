package core.models.entities

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

@Table(name = "users")
@Entity
data class User (
    @Id
    @GeneratedValue(generator = "UUID")
    var id : UUID? = null,

    @field:NotBlank(message = "First name must not be blank")
    var firstName: String = "",

    @field:NotBlank(message = "Last name must not be blank")
    var lastName: String = "",

    @field:Email
    @field:NotBlank(message = "email must not be blank")
    var email: String = "",

    @CreationTimestamp
    var createdAt: LocalDateTime? = null,

    @UpdateTimestamp
    var updatedAt: LocalDateTime? = null,
)