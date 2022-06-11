package com.example.navigationcomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class GameProgress extends Fragment {

    NavController navController;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button runGame=(Button) view.findViewById(R.id.runninggame_btn);
        /**
         * Create a instance of NavController
         */
        getNavControllerInstance(view);
        runGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationOperation();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      //  return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_gameprogress,container,false);
    }

    private void getNavControllerInstance(View view){
        navController= Navigation.findNavController(view);
    }

    private void navigationOperation(){
        navController.navigate(R.id.action_gameProgress_to_endGame);
    }
}
