package adapters.rest

import adapters.databases.panache.UserRepository
import core.models.entities.User
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource
import io.quarkus.rest.data.panache.ResourceProperties
import java.util.*

@ResourceProperties(path = "users")
interface UserResource : PanacheRepositoryResource<UserRepository, User, UUID>