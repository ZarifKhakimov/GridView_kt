package com.example.gridview_kt.activity

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.example.gridview_kt.R
import com.example.gridview_kt.adapter.GridAdapter
import com.example.gridview_kt.model.CourseModel


class GridActivity : AppCompatActivity() {
    var cd: ArrayList<CourseModel>? = null
    var coursesGV: GridView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        val coursesGV = findViewById<GridView>(R.id.idGVcourses)
        val courseArrayList: ArrayList<CourseModel> = ArrayList<CourseModel>()
        courseArrayList.add(CourseModel("Kotlin", R.drawable.xurshidbek_kurbanov))
        courseArrayList.add(CourseModel("JAVA", R.drawable.xurshidbek_kurbanov))
        courseArrayList.add(CourseModel("C++", R.drawable.xurshidbek_kurbanov))
        courseArrayList.add(CourseModel("Python", R.drawable.xurshidbek_kurbanov))
        courseArrayList.add(CourseModel("C#", R.drawable.xurshidbek_kurbanov))
        courseArrayList.add(CourseModel("Swift", R.drawable.xurshidbek_kurbanov))
        val adapter = GridAdapter(this, courseArrayList)
        coursesGV.adapter = adapter
    }
}