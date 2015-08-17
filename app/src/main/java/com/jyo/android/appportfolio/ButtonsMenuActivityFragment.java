package com.jyo.android.appportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class ButtonsMenuActivityFragment extends Fragment {

    private static final String BASE_APP_MESSAGE = "This button will launch my ";
    private static final String END_APP_MESSAGE = " app!";

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

        btnPopularMovies.setOnClickListener(onClickButtonListener("Popular Movies"));
        btnDuoScores.setOnClickListener(onClickButtonListener("Football Scores"));
        btnDuoLibrary.setOnClickListener(onClickButtonListener("Library"));
        btnBuildItBigger.setOnClickListener(onClickButtonListener("Build it Bigger"));
        btnXYZReader.setOnClickListener(onClickButtonListener("XYZ Reader"));
        btnCapstone.setOnClickListener(onClickButtonListener("Capstone"));

        return rootView;
    }

    public View.OnClickListener onClickButtonListener(final String appName){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast =  Toast.makeText(
                        getActivity(),
                        BASE_APP_MESSAGE + appName + END_APP_MESSAGE,
                        Toast.LENGTH_LONG);
                toast.show();
            }
        };
    }
}
