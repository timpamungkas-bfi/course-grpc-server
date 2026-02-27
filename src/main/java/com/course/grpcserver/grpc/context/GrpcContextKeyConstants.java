package com.course.grpcserver.grpc.context;

import io.grpc.Context;
import io.grpc.Metadata;

public class GrpcContextKeyConstants {

    // Mutable Metadata holder so the RPC handler can populate headers that the interceptor merges when sending response headers
    public static final Context.Key<Metadata> CONTEXT_KEY_GAMMA = Context.key("my-gamma-context");

    public static final Metadata.Key<String> METADATA_KEY_GAMMA_CONTEXT = Metadata.Key.of("my-gamma-metadata",
            Metadata.ASCII_STRING_MARSHALLER);

}
