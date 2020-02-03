package com.classming.rf;

import com.classming.MutateClass;

import java.util.List;
import java.util.Random;

public class BacktrackAction implements Action{
    @Override
    public State proceedAction(MutateClass target, List<State> total) {
        Random random = new Random();
        int selectedIndex = random.nextInt(total.size());
        return total.get(selectedIndex);
//        State current = total.get(selectedIndex);
//        String actionString = current.selectActionWithoutBacktrack();
//        Action action = RfFramework.getActionContainer().get(actionString);
//        return action.proceedAction(current.getTarget(), total);
    }
}
