package com.demo.service;

import com.demo.grpc.APIResponse;
import com.demo.grpc.Empty;
import com.demo.grpc.LoginRequest;
import com.demo.grpc.userGrpc.userImplBase;

import io.grpc.stub.StreamObserver;

public class UserImpl extends userImplBase {

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("inside login service");

		String username = request.getUsername();
		String pass = request.getPassword();

		System.out.println(String.format("Username: %s, Password: %s", username, pass));

		APIResponse.Builder response = APIResponse.newBuilder();

		if (username.equals(pass)) {
			// return success message

			response.setResponseMessage("SUCCESS");
			response.setResponseCode(1);

		} else {
			// return failure messages

			response.setResponseMessage("INVALID_AUTH");
			response.setResponseCode(0);
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("inside logout service");

		// TODO expired the active user session

		APIResponse.Builder response = APIResponse.newBuilder();
		response.setResponseMessage("SUCCESS");
		response.setResponseCode(1);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

}
