package practice.manu.scrollabletabviews.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import practice.manu.scrollabletabviews.R;

/**
 * Created by manojmuralidharan on 20/01/18.
 */

public class BusinessFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_business,container, false);
    }
}
