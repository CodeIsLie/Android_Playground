package com.bignerdranch.android.geoquiz;

public class Question {
    private int mTextResID;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        mTextResID = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResID(){
        return mTextResID;
    }

    public void setTextResID(int textResId) {
        mTextResID = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
