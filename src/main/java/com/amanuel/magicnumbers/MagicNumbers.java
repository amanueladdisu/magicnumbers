package com.amanuel.magicnumbers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagicNumbers {

    @RequestMapping("/")
    public String magicNumbers(@RequestParam("number") int number) {

        String magicNumStr = "Starting Number: "+number+"</br>"+String.valueOf(number)+"  ";

        while (number != 1) {

            if (number % 2 == 0) {

                number = number / 2;


            }
            else if(number % 2 != 0) {

                number = 3 * number + 1;

                       }

            magicNumStr += String.valueOf(number)+"  ";



        }


        return magicNumStr;
    }
}