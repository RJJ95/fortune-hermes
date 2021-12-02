package adapters.rest

import adapters.databases.panache.CompanyRepository
import core.models.entities.Company
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource
import io.quarkus.rest.data.panache.ResourceProperties
import java.util.UUID

@ResourceProperties(path = "companies")
interface CompanyResource : PanacheRepositoryResource<CompanyRepository, Company, UUID>