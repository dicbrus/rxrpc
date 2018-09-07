package com.slimgears.rxrpc.sample;

import com.slimgears.rxrpc.server.EndpointRouter.Configuration;
import com.slimgears.rxrpc.server.EndpointRouter.Factory;
import com.slimgears.rxrpc.server.EndpointRouter.Module;
import com.slimgears.rxrpc.server.EndpointRouters;
import com.slimgears.rxrpc.server.internal.MethodDispatcher;
import com.slimgears.rxrpc.server.internal.Publishers;
import java.lang.Integer;
import javax.annotation.Generated;

/**
 * Generated from com.slimgears.rxrpc.sample.SampleDefaultNameEndpoint
 */
@Generated("com.slimgears.rxrpc.apt.RxRpcEndpointAnnotationProcessor")
public class SampleDefaultNameEndpoint_RxModule implements Module {
    private final static MethodDispatcher<SampleDefaultNameEndpoint, Integer> method = (target, args) ->
            Publishers.toPublisher(target.method());


    private final static Factory dispatcherFactory = EndpointRouters
            .builder(SampleDefaultNameEndpoint.class)
            .method("method", method)
            .buildFactory();

    @Override
    public void configure(Configuration configuration) {
        configuration.addFactory("sample-default-name-endpoint", dispatcherFactory);
    }
}
