package com.example.cardviewexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArtAdapter (private val mcontext:Context, private val artList : List<Art>)
    :RecyclerView.Adapter<ArtAdapter.CardDesignObject> (){

    inner class CardDesignObject(view: View):RecyclerView.ViewHolder(view){

        var imageViewArt : ImageView
        var textViewArtName : TextView
        var textViewArtistName: TextView

        init {
            imageViewArt = view.findViewById(R.id.imageViewArt)
            textViewArtName = view.findViewById(R.id.textViewArtName)
            textViewArtistName = view.findViewById(R.id.textViewArtistName)
        }
    }

    override fun getItemCount(): Int {
        return artList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignObject {
        val design = LayoutInflater.from(mcontext).inflate(R.layout.card_view_design,parent,false)
        return CardDesignObject(design)
    }

    override fun onBindViewHolder(holder: CardDesignObject, position: Int) {
        val art = artList[position]

        holder.textViewArtistName.text = art.artist_name
        holder.textViewArtName.text=art.art_name

        holder.imageViewArt.setImageResource(
            mcontext.resources.getIdentifier(art.art_picture_name,"drawable",mcontext.packageName))



    }
}