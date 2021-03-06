package com.slimgears.rxrpc.sample;

import com.slimgears.rxrpc.client.AbstractClient;
import com.slimgears.rxrpc.client.RxClient.Session;
import com.slimgears.util.reflect.TypeToken;
import io.reactivex.Observable;
import java.lang.Integer;
import javax.annotation.Generated;

/**
 * Generated from com.slimgears.rxrpc.sample.SampleGenericMetaEndpointClass_Of_Integer
 */
@Generated("com.slimgears.rxrpc.apt.RxRpcEndpointAnnotationProcessor")
public class SampleGenericMetaEndpointClass_Of_Integer_RxClient extends AbstractClient {
    public SampleGenericMetaEndpointClass_Of_Integer_RxClient(Session session) {
        super(session);
    }

    public Observable<Integer> genericMethod(Integer data) {
        return invokeObservable(
            TypeToken.of(Integer.class),
            "sample-generic-meta-endpoint-class_of_integer/genericMethod",
            arguments()
                .put("data", data));
    }

}
