package com.course.grpcserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.course.grpcserver.grpc.server.HelloServiceGrpcServer;
import com.linecorp.armeria.server.docs.DocService;
import com.linecorp.armeria.server.grpc.GrpcService;
import com.linecorp.armeria.spring.ArmeriaServerConfigurator;

@Configuration
public class ArmeriaConfig {

    @Bean
    public ArmeriaServerConfigurator armeriaServerConfigurator(HelloServiceGrpcServer helloServiceGrpcServer) {
        return builder -> {
            var grpcService = GrpcService.builder()
                    .addService(helloServiceGrpcServer)
                    .enableUnframedRequests(true)
                    .useBlockingTaskExecutor(true)
                    .enableHttpJsonTranscoding(true)
                    .build();

            builder.service(grpcService);

            builder.serviceUnder("/docs", DocService.builder().build());
        };
    }

}
