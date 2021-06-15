package Myntra.common.repository

import Myntra.common.entity.AppConfigEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AppConfigRepository extends JpaRepository<AppConfigEntity, Long> {
}
