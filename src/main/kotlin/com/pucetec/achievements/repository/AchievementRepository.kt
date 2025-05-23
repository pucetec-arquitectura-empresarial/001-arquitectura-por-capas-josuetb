package com.pucetec.achievements.repository

import com.pucetec.achievements.model.Achievement
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AchievementRepository : JpaRepository<Achievement, Long>
