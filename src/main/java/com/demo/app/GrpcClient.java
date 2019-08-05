package com.demo.app;

import java.util.concurrent.TimeUnit;

import com.demo.grpc.APIResponse;
import com.demo.grpc.LoginRequest;
import com.demo.grpc.userGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class GrpcClient {
	private final ManagedChannel channel;
	private final userGrpc.userBlockingStub blockingStub;

	/** Construct client connecting to HelloWorld server at {@code host:port}. */
	public GrpcClient(String host, int port) {
		this(ManagedChannelBuilder.forAddress(host, port)
				// Channels are secure by default (via SSL/TLS). For the example we disable TLS
				// to avoid
				// needing certificates.
				.usePlaintext().build());
	}

	/**
	 * Construct client for accessing HelloWorld server using the existing channel.
	 */
	GrpcClient(ManagedChannel channel) {
		this.channel = channel;
		blockingStub = userGrpc.newBlockingStub(channel);
	}

	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

	/** Say hello to server. */
	public void login(String username, String pass) {
		System.out.println(String.format("Will try to login. username: %s, password: %s ...", username, pass));
		LoginRequest request = LoginRequest.newBuilder().setUsername(username).setPassword(pass).build();
		APIResponse response;
		try {
			response = blockingStub.login(request);
		} catch (StatusRuntimeException e) {
			System.err.println("RPC failed: " + e.getStatus());
			return;
		}

		System.out.println(String.format("Response: { message: %s, code: %d }", response.getResponseMessage(),
				response.getResponseCode()));
	}

	/**
	 * Greet server. If provided, the first element of {@code args} is the name to
	 * use in the greeting.
	 */
	public static void main(String[] args) throws Exception {
		GrpcClient client = new GrpcClient("localhost", 9090);
		try {
			/* Access a service running on the local machine on port 50051 */
			String username = "hello";
			String pass = "hello";
			client.login(username, pass);
			client.shutdown();
		} finally {
			client.shutdown();
		}
	}
}
