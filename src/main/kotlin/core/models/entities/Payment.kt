package core.models.entities

import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "payments")
@Entity
data class Payment (
    @Id
    @GeneratedValue(generator = "UUID")
    var id : UUID? = null,

    var bankAccountId : UUID? = null,
    var amount : Float? = null,
    var counterPartyName : String? = "",
    var counterPartyIban : String? = "",

    @CreationTimestamp
    var createdAt: LocalDateTime? = null,
)