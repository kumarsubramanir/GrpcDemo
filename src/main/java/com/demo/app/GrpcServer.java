package com.demo.app;

import java.io.IOException;

import com.demo.service.UserImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {

	private Server server;

	private void start() throws IOException {
		/* The port on which the server should run */
		int port = 9090;
		server = ServerBuilder.forPort(port).addService(new UserImpl()).build().start();
		System.out.println("Server started, listening on " + port);

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				// Use stderr here since the logger may have been reset by its JVM shutdown
				// hook.
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				GrpcServer.this.stop();
				System.err.println("*** server shut down");
			}
		});
	}

	private void stop() {
		if (server != null) {
			server.shutdown();
		}
	}

	/**
	 * Await termination on the main thread since the grpc library uses daemon
	 * threads.
	 */
	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	/**
	 * Main launches the server from the command line.
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		final GrpcServer server = new GrpcServer();
		server.start();
		server.blockUntilShutdown();
	}

}
