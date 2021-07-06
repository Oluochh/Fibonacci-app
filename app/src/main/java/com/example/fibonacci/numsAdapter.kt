package com.example.recyclerfibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fibonacci.R
import java.math.BigInteger

class numsAdapter(var numList:List<BigInteger>):RecyclerView.Adapter<NumViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumViewHolder {
//        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.activity_num_adapter,parent,false)
//        return NumViewHolder(itemView)
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.activity_num_adapter,parent,false)
        return NumViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumViewHolder, position: Int) {
        holder.tvNumber.text=numList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numList.count()
    }


}
class NumViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView) {
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
}

