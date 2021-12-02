package adapters.rest

import adapters.databases.panache.WatchListItemRepository
import core.models.entities.WatchListItem
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource
import io.quarkus.rest.data.panache.ResourceProperties
import java.util.UUID

@ResourceProperties(path = "watch-list-items")
interface WatchListItemResource :
    PanacheRepositoryResource<WatchListItemRepository, WatchListItem, UUID>