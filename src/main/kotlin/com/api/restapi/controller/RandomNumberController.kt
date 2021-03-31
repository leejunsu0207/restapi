package com.api.restapi.controller

import com.api.restapi.model.http.RandomNumberDto
import com.api.restapi.repository.RandomNumberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid


@RestController
@RequestMapping("/api")
class RandomNumberController() {



    @PostMapping("/randomN")
    fun randomNum(@RequestBody randomNumberDto: RandomNumberDto): List<Int> {

        return bubleSort(getRandomList())
    }


    fun getRandomList(): List<Int> = List(7) {
          val random = Random()
         random.nextInt(44+1)
    }

    fun bubleSort(data: List<Int>): List<Int> {

        for (temp in data){
            println(temp)
        }

        for (i in n - 1 downTo 1) {
            for (j in 0 until i) {
                if (data[j] > data[j + 1]) {
                    val tmp = data[j]
                    data[j] = data[j + 1]
                    data[j + 1] = tmp
                }
            }
        }



        return list
    }
}