package com.example.db_practice_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<StudentModel> {
    public ListAdapter (Context context, ArrayList<StudentModel> student){
        super(context,R.layout.list_item,student);
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View ConvertView, @NonNull ViewGroup parent){
        StudentModel student=getItem(position);
        ConvertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        TextView txt= ConvertView.findViewById(R.id.Name);
        TextView roll = ConvertView.findViewById(R.id.Rollno);
        Switch switch1 = ConvertView.findViewById(R.id.switch1);

        txt.setText(student.getName());
        roll.setText(String.valueOf(student.getRollNmber()));
        switch1.setChecked(student.isEnroll());

        return ConvertView;
    }
}

