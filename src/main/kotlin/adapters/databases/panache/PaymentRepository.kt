package adapters.databases.panache

import core.models.entities.Payment
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class PaymentRepository : PanacheRepositoryBase<Payment, UUID>