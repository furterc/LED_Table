package com.christo.led_table;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SwipeFragment extends Fragment
{
    private Context mContext;
    private View mView;

    public SwipeFragment()
    {
        //requires empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        mView = inflater.inflate(R.layout.fragment_swipe, container, false);

        setHasOptionsMenu(true);
        mContext = mView.getContext();

        // assign ui element shit here.


        return mView;
    }
}
