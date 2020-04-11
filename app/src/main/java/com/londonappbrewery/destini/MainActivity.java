package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButtonT;
    private Button mButtonB;

    private StoryTelling[] story=new StoryTelling[]{
            new StoryTelling(R.string.T1_Story),
            new StoryTelling(R.string.T2_Story),
            new StoryTelling(R.string.T3_Story),
            new StoryTelling(R.string.T4_End),
            new StoryTelling(R.string.T5_End),
            new StoryTelling(R.string.T6_End)
    };
    private TopAnswer[] tAns=new TopAnswer[]{
            new TopAnswer(R.string.T1_Ans1),
            new TopAnswer(R.string.T2_Ans1),
            new TopAnswer(R.string.T3_Ans1)
    };
    private BottomAnswer[] bAns=new BottomAnswer[]{
            new BottomAnswer(R.string.T1_Ans2),
            new BottomAnswer(R.string.T2_Ans2),
            new BottomAnswer(R.string.T3_Ans2)
    };
    private EndStory[] eStory=new EndStory[]{
            new EndStory(R.string.T4_End),
            new EndStory(R.string.T5_End),
            new EndStory(R.string.T6_End)
    };
    int index=0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView=(TextView)findViewById(R.id.storyTextView);
        mButtonB=(Button)findViewById(R.id.buttonBottom);
        mButtonT=(Button)findViewById(R.id.buttonTop);

        mTextView.setText(story[0].getStoryId());
        mButtonT.setText(tAns[0].getAnsId());
        mButtonB.setText(bAns[0].getAnsId());

        mButtonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forTop();

            }
        });

        mButtonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               forBottom();
            }
        });
    }

    public void forTop(){
        if(index==0 || index==1) {
            mTextView.setText(story[2].getStoryId());
            mButtonT.setText(tAns[2].getAnsId());
            mButtonB.setText(bAns[2].getAnsId());
            index = 2;
        }
        else if(index==2){
            mTextView.setText(story[5].getStoryId());
            mButtonT.setVisibility(View.GONE);
            mButtonB.setVisibility(View.GONE);
        }
    }

    public void forBottom(){
        if(index==0){
            mTextView.setText(story[1].getStoryId());
            mButtonT.setText(tAns[1].getAnsId());
            mButtonB.setText(bAns[1].getAnsId());
            index=1;
        }
        else if(index==1){
            mTextView.setText(story[3].getStoryId());
            mButtonT.setVisibility(View.GONE);
            mButtonB.setVisibility(View.GONE);
        }
        else if(index==2){
            mTextView.setText(story[4].getStoryId());
            mButtonT.setVisibility(View.GONE);
            mButtonB.setVisibility(View.GONE);
        }
    }


}
