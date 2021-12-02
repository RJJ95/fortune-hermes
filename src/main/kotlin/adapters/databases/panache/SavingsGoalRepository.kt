package adapters.databases.panache

import core.models.entities.SavingsGoal
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class SavingsGoalRepository : PanacheRepositoryBase<SavingsGoal, UUID>