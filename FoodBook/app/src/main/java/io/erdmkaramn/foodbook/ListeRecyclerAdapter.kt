package io.erdmkaramn.foodbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_liste.view.*
import kotlinx.android.synthetic.main.recycler_row.view.*

class ListeRecyclerAdapter(val yemekListesi: ArrayList<String>, yemekIdListesi: ArrayList<Int>):RecyclerView.Adapter<ListeRecyclerAdapter.YemekHolder>() {

    class YemekHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YemekHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.recycler_row,parent,false)
        return YemekHolder(view)
    }

    override fun onBindViewHolder(holder: YemekHolder, position: Int) {
        holder.itemView.recycler_row_text.text=yemekListesi[position]
        holder.itemView.setOnClickListener{
            val action=ListeFragmentDirections.actionListeFragmentToTarifFragment("menudengeldim",0)
            Navigation.findNavController(this,R.id.fragment).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return yemekListesi.size
    }
}

private fun Navigation.findNavController(
    activity: ListeRecyclerAdapter,
    viewId: Int
): NavController {
    TODO("Not yet implemented")
}
