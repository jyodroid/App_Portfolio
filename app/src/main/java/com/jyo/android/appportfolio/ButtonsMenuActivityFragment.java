package com.jyo.android.appportfolio;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class ButtonsMenuActivityFragment extends Fragment {

    public static final String BASE_APP_MESSAGE = "This button will launch my ";
    public static final String END_APP_MESSAGE = " app!";

    public ButtonsMenuActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_buttons_menu, container, false);

        Button btnPopularMovies = (Button) rootView.findViewById(R.id.btn_popular_movies);
        Button btnDuoScores = (Button) rootView.findViewById(R.id.btn_duo_scores);
        Button btnDuoLibrary = (Button) rootView.findViewById(R.id.btn_duo_library);
        Button btnBuildItBigger = (Button) rootView.findViewById(R.id.btn_build_bigger);
        Button btnXYZReader = (Button) rootView.findViewById(R.id.btn_xyz_reader);
        Button btnCapstone = (Button) rootView.findViewById(R.id.btn_capstone);

        btnPopularMovies.setOnClickListener(onClickButtonListener(getString(R.string.app_popular_movies)));
        btnDuoScores.setOnClickListener(onClickButtonListener(getString(R.string.app_duo_scores)));
        btnDuoLibrary.setOnClickListener(onClickButtonListener(getString(R.string.app_duo_library)));
        btnBuildItBigger.setOnClickListener(onClickButtonListener(getString(R.string.app_build_it_bigger)));
        btnXYZReader.setOnClickListener(onClickButtonListener(getString(R.string.app_xyz_reader)));
        btnCapstone.setOnClickListener(onClickButtonListener(getString(R.string.app_capstone)));

        return rootView;
    }

    public View.OnClickListener onClickButtonListener(final String appName) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,
                        BASE_APP_MESSAGE + appName + END_APP_MESSAGE, Snackbar.LENGTH_LONG)
                        .show();
            }
        };
    }
}
