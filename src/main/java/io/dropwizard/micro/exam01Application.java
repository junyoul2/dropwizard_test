package io.dropwizard.micro;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class exam01Application extends Application<exam01Configuration> {

    public static void main(final String[] args) throws Exception {
        new exam01Application().run(args);
    }

    @Override
    public String getName() {
        return "exam01";
    }

    @Override
    public void initialize(final Bootstrap<exam01Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final exam01Configuration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
