package adapters.rest

import adapters.databases.panache.ListedCompanyRepository
import core.models.entities.ListedCompany
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource
import io.quarkus.rest.data.panache.ResourceProperties
import java.util.UUID

@ResourceProperties(path = "listed-companies")
interface ListedCompanyResource :
    PanacheRepositoryResource<ListedCompanyRepository, ListedCompany, UUID>