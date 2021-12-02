package adapters.databases.panache

import core.models.entities.BankAccount
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class BankAccountRepository : PanacheRepositoryBase<BankAccount, UUID>