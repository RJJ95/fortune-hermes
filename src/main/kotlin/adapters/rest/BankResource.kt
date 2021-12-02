package adapters.rest

import adapters.databases.panache.BankRepository
import core.models.entities.Bank
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource
import io.quarkus.rest.data.panache.ResourceProperties
import java.util.UUID

@ResourceProperties(path = "banks")
interface BankResource : PanacheRepositoryResource<BankRepository, Bank, UUID>