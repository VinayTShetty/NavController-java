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

public class EndGame extends Fragment {

    NavController navController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_endgame,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /**
         * Create a instance of NavController
         */
        getNavControllerInstance(view);
        Button endGame=(Button) view.findViewById(R.id.endgame_btn);
        endGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateOperation();
            }
        });
    }

    private void getNavControllerInstance(View view){
        navController=Navigation.findNavController(view);
    }

    private void navigateOperation(){
        navController.navigate(R.id.action_endGame_to_startGame3);
    }
}
