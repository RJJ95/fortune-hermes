package adapters.rest

import adapters.databases.panache.WatchListRepository
import core.models.entities.WatchList
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource
import io.quarkus.rest.data.panache.ResourceProperties
import java.util.UUID

@ResourceProperties(path = "watch-lists")
interface WatchListResource : PanacheRepositoryResource<WatchListRepository, WatchList, UUID>