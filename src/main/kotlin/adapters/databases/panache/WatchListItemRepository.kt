package adapters.databases.panache

import core.models.entities.WatchListItem
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class WatchListItemRepository : PanacheRepositoryBase<WatchListItem, UUID>