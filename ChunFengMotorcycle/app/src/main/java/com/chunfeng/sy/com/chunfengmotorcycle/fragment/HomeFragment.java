package com.chunfeng.sy.com.chunfengmotorcycle.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chunfeng.sy.com.chunfengmotorcycle.R;

/**
 * Created by Trust on 16/12/27.
 */
public class HomeFragment extends Fragment {
    private View v;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        v = inflater.inflate(R.layout.fragment_home, null);

        return v;

    }
}
