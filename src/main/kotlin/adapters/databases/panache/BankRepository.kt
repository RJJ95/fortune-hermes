package adapters.databases.panache

import core.models.entities.Bank
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class BankRepository : PanacheRepositoryBase<Bank, UUID>