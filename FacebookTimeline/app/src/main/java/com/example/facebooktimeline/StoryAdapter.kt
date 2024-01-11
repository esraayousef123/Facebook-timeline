package com.example.facebooktimeline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter (val lsitOfStories : MutableList<StoryData>) : RecyclerView.Adapter<StoryAdapter.storyViewHolder>(){
    class storyViewHolder(storyItem : View) : RecyclerView.ViewHolder(storyItem){
        val storyContant = storyItem.findViewById<ImageView>(R.id.iv_story_contant)
        val storyOwner = storyItem.findViewById<ImageView>(R.id.story_owner)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): storyViewHolder {
        val storyItem = LayoutInflater.from(parent.context).inflate(R.layout.story_item,parent , false)
        return storyViewHolder(storyItem)

    }

    override fun getItemCount(): Int {
         return  lsitOfStories.size
    }

    override fun onBindViewHolder(holder: storyViewHolder, position: Int) {
        val storyItemFromList = lsitOfStories[position]
        holder.storyContant.setImageResource(storyItemFromList.storyContant)
        holder.storyOwner.setImageResource(storyItemFromList.ProfilePic)
    }
}