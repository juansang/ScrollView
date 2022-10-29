package com.example.beatlesscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button comButton;
    private Button saveButton;
    private String comment;
    private EditText comment_box;
    private TextView commentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comment_box = (EditText) findViewById(R.id.comment_box);
        comment_box.setVisibility(View.INVISIBLE);

        saveButton = findViewById(R.id.addText_button);

        comButton = findViewById(R.id.comment_button);
        comButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comment_box.setVisibility(View.VISIBLE);
                saveButton.setVisibility(View.VISIBLE);
            }
        });


        saveButton.setVisibility(View.INVISIBLE);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comment_box.setVisibility(View.INVISIBLE);
                writeComment();
            }
        });


    }
    public void writeComment(){
        comment="Your comment: " + comment_box.getText().toString();
        commentTextView = findViewById(R.id.comment_text);
        commentTextView.setText(comment);
        comButton.setVisibility(View.INVISIBLE);
        comment_box.setVisibility(View.INVISIBLE);
        saveButton.setVisibility(View.INVISIBLE);
    }
}