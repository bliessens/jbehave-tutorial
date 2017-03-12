package be.cheops.applications;

import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class StoryOne extends JBehaveConfiguration {

    @Override
    public InjectableStepsFactory stepsFactory() {
        // varargs, can have more that one steps classes
        return new InstanceStepsFactory(configuration(), new StoryOneSteps());
    }

}
