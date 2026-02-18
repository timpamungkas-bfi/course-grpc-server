package com.course.grpcserver.grpc.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.central.proto.hello.Hello.SayHelloRequest;
import com.course.central.proto.hello.Hello.SayHelloResponse;
import com.course.grpcserver.service.HelloService;
import com.course.central.proto.hello.HelloServiceGrpc;

import io.grpc.stub.StreamObserver;

@Service
public class HelloServiceGrpcServer extends HelloServiceGrpc.HelloServiceImplBase {

    private HelloService helloService;

    public HelloServiceGrpcServer(@Autowired HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public void sayHello(SayHelloRequest request, StreamObserver<SayHelloResponse> responseObserver) {
        // TODO: Retrieve the name from the request and generate the message using the helloService
        // var name = request....
        // var message = helloService.generateHello(name);

        var response = SayHelloResponse.newBuilder()
                // TODO: Set the generated message in the response
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
}
