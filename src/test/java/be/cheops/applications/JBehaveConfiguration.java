package be.cheops.applications;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;

public class JBehaveConfiguration extends JUnitStory {

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                // determine behaviour for @Pending (not yet implemented) steps
                //.usePendingStepStrategy(new PassingUponPendingStep())
//                .useStoryParser(new RegexStoryParser(new ExamplesTableFactory(new LoadFromClasspath(this.getClass()))))
                // where to find the stories
                .useStoryLoader(new LoadFromClasspath(this.getClass()))
                // CONSOLE and TXT reporting
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withDefaultFormats()
                        .withFormats(Format.CONSOLE, Format.TXT, Format.IDE_CONSOLE, Format.HTML));
    }
}
