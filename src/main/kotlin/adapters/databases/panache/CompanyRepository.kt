package adapters.databases.panache

import core.models.entities.Company
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class CompanyRepository : PanacheRepositoryBase<Company, UUID>