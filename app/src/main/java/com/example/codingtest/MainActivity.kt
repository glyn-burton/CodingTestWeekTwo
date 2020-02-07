package com.example.codingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val interpretString = "frog"

        val superArray: Array<Array<String>> = arrayOf(
            arrayOf("a", "b", "b", "c", "d"),
            arrayOf("c", "a", "e", "d","e")
            )



        //stringInterpreter(interpretString)

        OtherCodingArrayProblem()

        sortArrayFunc()
    }

    fun sortArrayFunc (){

        val unSortedArray = arrayOf(2,8,9,3,4,3,2,6,6,2,4,9,8)
        unSortedArray.sort()


        Log.d("TAG", Arrays.toString(unSortedArray))


    }

    fun stringInterpreter (interpret:String){

        interpret.toCharArray()
        val length = interpret.count()
        for (i in 0..length)
        {



        }



        var finalArray:ArrayList<String>

        for (i in 0..length){
            var tempString = ""
            tempString = i.toString()+(i+1).toString()
            /* What to do here:
            Take the string, and the string length.
            split the original string into its individual characters
            How to add the characters for all the permutations:
            Put the individual characters into a hashmap



            */
        }




    }



    fun ArrayProblem(thisArr: Array<Array<String>>)
    {
         //For this problem I would use the flatten method to
        //push both arrays into one array and sort the list. From there I would be able
        //tell which character is being duplicated, pass those to a variable and
        // locate them in the 2D array




    }

    fun OtherCodingArrayProblem () {
        //This is from the coding questions I saw in the Delta project. I wanted to try this one since I had a
        //lot of trouble on the other 2 here.
        //Find the sum of the two largest numbers in a array
        val sumNum = arrayOf(1,4,7,2,9,4,0,3,8,10,13,27,12)

        sumNum.sort()

        val length = sumNum.size

        val num1 = sumNum[length - 1]

        val num2 = sumNum[length - 2]

        val result = num1 + num2

        Log.d("TAG",result.toString())


    }
}
