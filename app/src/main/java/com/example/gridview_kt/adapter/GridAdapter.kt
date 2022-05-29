package com.example.gridview_kt.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.gridview_kt.R
import com.example.gridview_kt.model.CourseModel


class GridAdapter(context: Context, courseModelArrayList: ArrayList<CourseModel>) :
    ArrayAdapter<CourseModel?>(context, 0, courseModelArrayList as List<CourseModel?>) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listitemView = convertView
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView =
                LayoutInflater.from(context).inflate(R.layout.item_member_view, parent, false)
        }
        val courseModel: CourseModel? = getItem(position)
        val courseTV = listitemView!!.findViewById<TextView>(R.id.idTVCourse)
        val courseIV = listitemView.findViewById<ImageView>(R.id.idIVcourse)
        if (courseModel != null) {
            courseTV.setText(courseModel.course_name)
        }
        if (courseModel != null) {
            courseIV.setImageResource(courseModel.imgid)
        }
        return listitemView
    }
}