package adapters.rest

import adapters.databases.panache.BankAccountRepository
import core.models.entities.BankAccount
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource
import io.quarkus.rest.data.panache.ResourceProperties
import java.util.UUID

@ResourceProperties(path = "banks/{bankId}/bank-accounts")
interface BankAccountResource : PanacheRepositoryResource<BankAccountRepository, BankAccount, UUID>