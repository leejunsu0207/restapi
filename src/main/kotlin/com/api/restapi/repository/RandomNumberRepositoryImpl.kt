package com.api.restapi.repository

import com.api.restapi.model.http.RandomNumberDto
import org.springframework.stereotype.Service
import java.util.*

@Service
class RandomNumberRepositoryImpl : RandomNumberRepository{
    val random = Random()

//    override fun getRandomList(): RandomNumberDto {
//        val qqw:MutableList<Int>? = null
//        random.nextInt(45)
//    }


}