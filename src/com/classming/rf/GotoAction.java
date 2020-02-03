package com.classming.rf;

import com.classming.MutateClass;

import java.io.IOException;
import java.util.List;

public class GotoAction implements Action{
    @Override
    public State proceedAction(MutateClass target, List<State> total) {
        try {
            MutateClass newOne = target.iteration();
            State nextState = new State();
            nextState.setTarget(newOne);
            return nextState;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
