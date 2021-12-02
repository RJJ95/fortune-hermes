package adapters.rest

import adapters.databases.panache.PaymentRepository
import core.models.entities.Payment
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource
import io.quarkus.rest.data.panache.ResourceProperties
import java.util.UUID

@ResourceProperties(path = "payments")
interface PaymentResource : PanacheRepositoryResource<PaymentRepository, Payment, UUID>