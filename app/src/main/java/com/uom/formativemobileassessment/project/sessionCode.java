package com.uom.formativemobileassessment.project;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class sessionCode extends navigation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_session_code, null, false);
        drawer.addView(contentView, 0);
    }

}
