package adapters.databases.panache

import core.models.entities.WatchList
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class WatchListRepository : PanacheRepositoryBase<WatchList, UUID>