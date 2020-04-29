package com.example.recyclerview

import android.content.ClipData
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRecyclerView();
    }

    private fun setRecyclerView()
    {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);
        recyclerView.apply {
            setHasFixedSize(true);
            layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false);
            val list = prepareList();
            adapter = Adapter(list);
        }
    }

    private fun prepareList():ArrayList<ItemList>
    {
        val list = ArrayList<ItemList>();
        list.add(ItemList("1",R.drawable.image1));
        list.add(ItemList("1",R.drawable.image2));
        list.add(ItemList("1",R.drawable.image3));
        list.add(ItemList("1",R.drawable.image4));
        list.add(ItemList("1",R.drawable.image1));
        list.add(ItemList("1",R.drawable.image2));
        list.add(ItemList("1",R.drawable.image3));
        list.add(ItemList("1",R.drawable.image4));
        list.add(ItemList("1",R.drawable.image1));
        list.add(ItemList("1",R.drawable.image2));
        list.add(ItemList("1",R.drawable.image3));
        list.add(ItemList("1",R.drawable.image4));
        list.add(ItemList("1",R.drawable.image1));
        list.add(ItemList("1",R.drawable.image2));
        list.add(ItemList("1",R.drawable.image3));
        list.add(ItemList("1",R.drawable.image4));
        list.add(ItemList("1",R.drawable.image1));
        list.add(ItemList("1",R.drawable.image2));
        list.add(ItemList("1",R.drawable.image3));
        list.add(ItemList("1",R.drawable.image4));


        return (list);
    }
}
