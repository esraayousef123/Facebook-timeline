package com.example.facebooktimeline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var facebookRecyclerView : RecyclerView
    lateinit var storyRecyclerView: RecyclerView
    lateinit var stroy_adapter : StoryAdapter
    lateinit var adapter: FacebookTimelineAdapter
    lateinit var listOfPosts : MutableList<PostData>
    lateinit var listOfStories : MutableList<StoryData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        facebookRecyclerView = findViewById(R.id.timelineRecyclarView)
        storyRecyclerView = findViewById(R.id.rv_story)
        CreateStoryList()
        CreatePostList()
        stroy_adapter = StoryAdapter(listOfStories)
        adapter = FacebookTimelineAdapter(listOfPosts)
        storyRecyclerView.adapter = stroy_adapter
        facebookRecyclerView.adapter = adapter





    }

    private fun CreateStoryList() {
        listOfStories = mutableListOf()
        for (i in 1..100){

            listOfStories.add(StoryData(R.drawable.child , R.drawable.palestine_child))

        }



    }

    private fun CreatePostList() {
        listOfPosts = mutableListOf()
        for(i in 1 .. 100){
            listOfPosts.add(PostData(User(R.drawable.palestine_child ,"Esraa Yousef" ), R.drawable.palestine_flag,"Alawys FREE PALESTINE"))
            listOfPosts.add(
                PostData(User(R.drawable.never_give_up , "Palestine") , R.drawable.aqsa , " المسجد الأقصى هو معبد إسلامي يقع في القدس، ويُعتبر ثالث أقدس المساجد في الإسلام بعد المسجد الحرام في مكة والمسجد النبوي في المدينة المنورة.")
            )
            listOfPosts.add(
                PostData(User(R.drawable.free_palestine , "Asmaa Mohammed") ,R.drawable.free_palestine,"")

            )
            listOfPosts.add(
                PostData(User(R.drawable.palestine_flag , "Esraa Yousef") ,R.drawable.saleh,"Saleh el gaafrawy")

            )
            listOfPosts.add(
                PostData(User(R.drawable.free_palestine , "Esraa Yousef") ,R.drawable.motazaziza,"the hero ")

            )
            listOfPosts.add(
                PostData(User(R.drawable.free_palestine , "Esraa Yousef") ,R.drawable.dahdoh," Wael el Dahdoh")

            )
            listOfPosts.add(
                PostData(User(R.drawable.palestine_child , "Esraa Yousef") ,R.drawable.abou_obeida," ABOU ABIDA")

            )
            listOfPosts.add(
                PostData(User(R.drawable.palestine_child , "Esraa Yousef") ,R.drawable.child," god bless you")

            )
        }



    }
}