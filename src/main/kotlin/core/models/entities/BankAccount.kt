package core.models.entities

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "bankAccounts")
@Entity
data class BankAccount(
    @Id
    @GeneratedValue(generator = "UUID")
    var id: UUID? = null,

    var userId: UUID? = null,
    var bankId: UUID? = null,
    var iban: String = "",
    var balance: Float? = null,

    @CreationTimestamp
    var createdAt: LocalDateTime? = null,

    @UpdateTimestamp
    var updatedAt: LocalDateTime? = null,
)