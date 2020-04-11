package com.londonappbrewery.destini;

public class StoryTelling {
    private int storyId;
    StoryTelling(int storyId){
       this.storyId=storyId;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }
}
