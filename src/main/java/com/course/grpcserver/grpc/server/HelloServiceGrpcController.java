package com.course.grpcserver.grpc.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.central.proto.hello.Hello.SayHelloRequest;
import com.course.central.proto.hello.Hello.SayHelloResponse;
import com.course.grpcserver.logic.HelloLogic;
import com.course.central.proto.hello.HelloServiceGrpc;

import io.grpc.stub.StreamObserver;

@Service
public class HelloServiceGrpcController extends HelloServiceGrpc.HelloServiceImplBase {

    private HelloLogic helloLogic;

    public HelloServiceGrpcController(@Autowired HelloLogic helloLogic) {
        this.helloLogic = helloLogic;
    }

    @Override
    public void sayHello(SayHelloRequest request, StreamObserver<SayHelloResponse> responseObserver) {
        var name = request.getName();
        var message = helloLogic.generateHello(name);

        var response = SayHelloResponse.newBuilder()
                .setGreet(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
}
