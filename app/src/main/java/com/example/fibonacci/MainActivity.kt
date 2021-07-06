package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerfibonacci.numsAdapter
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
    }
    fun castView(){
        rvNumbers=findViewById(R.id.rvNumbers)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
        var numAdapter=numsAdapter(showNum(100))
        rvNumbers.adapter=numAdapter
//        var numAdapter(showNum(100))
//        rvNumbers.adapter=numAdapter
    }
    fun showNum(upto:Int):List<BigInteger>{
        var first=BigInteger.ZERO
        var next=BigInteger.ONE
        var nums= MutableList<BigInteger>(upto,{BigInteger.ZERO })
        nums[0]=first
        nums[1]=next
        for (i in 1..upto){
            var nums1=first+next
            first=next
            next=nums1
            nums[i-1]=first


        }
        return nums


    }
}