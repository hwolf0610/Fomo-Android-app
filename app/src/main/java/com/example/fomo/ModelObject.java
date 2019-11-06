package com.example.fomo;


public enum ModelObject {

    RED(R.string.red, R.layout.tab_fragment1),
    BLUE(R.string.blue, R.layout.tab_fragment2),
    ORGANE(R.string.orange, R.layout.tab_fragment3),
    GREEN(R.string.green, R.layout.tab_fragment3);


    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
