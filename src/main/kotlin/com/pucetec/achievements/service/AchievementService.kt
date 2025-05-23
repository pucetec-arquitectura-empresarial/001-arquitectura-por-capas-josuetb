package com.pucetec.achievements.service

import com.pucetec.achievements.model.Achievement
import com.pucetec.achievements.repository.AchievementRepository
import org.springframework.stereotype.Service

@Service
class AchievementService(private val repository: AchievementRepository) {

    fun findAll(): List<Achievement> = repository.findAll()

    fun save(achievement: Achievement): Achievement = repository.save(achievement)
}
