package adapters.rest;

import adapters.databases.panache.SavingsGoalRepository
import core.models.entities.SavingsGoal
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource
import io.quarkus.rest.data.panache.ResourceProperties
import java.util.UUID

@ResourceProperties(path = "savings-goals")
interface SavingsGoalResource : PanacheRepositoryResource<SavingsGoalRepository, SavingsGoal, UUID>
