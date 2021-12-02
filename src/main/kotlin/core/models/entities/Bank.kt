package core.models.entities

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotBlank

@Table(name = "banks")
@Entity
data class Bank (
    @Id
    @GeneratedValue(generator = "UUID")
    var id : UUID? = null,

    @field:NotBlank(message = "Name must not be blank")
    var name: String = "",
    var logoLink: String? = "",

    @CreationTimestamp
    var createdAt: LocalDateTime? = null,

    @UpdateTimestamp
    var updatedAt: LocalDateTime? = null,
)