package com.example.facebooktimeline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FacebookTimelineAdapter( val listOfPostsData :MutableList<PostData>) : RecyclerView.Adapter<FacebookTimelineAdapter.ViewHolder>() {
    class ViewHolder(postItem : View) : RecyclerView.ViewHolder(postItem) {

            val userName: TextView = postItem.findViewById(R.id.profileName)
            val profilePic: ImageView = postItem.findViewById(R.id.profilePic)
            val post: ImageView = postItem.findViewById(R.id.postImage)
            val caption: TextView = postItem.findViewById(R.id.caption)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val PostItem  = LayoutInflater.from(parent.context).inflate(R.layout.post_item,parent , false)
        return ViewHolder(PostItem)


    }

    override fun getItemCount(): Int {
        return listOfPostsData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val postItemFromList = listOfPostsData[position]
        holder.userName.text = postItemFromList.user.acc_name
        holder.post.setImageResource(postItemFromList.postimage)
        holder.profilePic.setImageResource(postItemFromList.user.profile_pic)
        holder.caption.text = postItemFromList.caption
    }


}