// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.demo.grpc;

/**
 * Protobuf type {@code APIResponse}
 */
public final class APIResponse extends com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:APIResponse)
		APIResponseOrBuilder {
	private static final long serialVersionUID = 0L;

	// Use APIResponse.newBuilder() to construct.
	private APIResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private APIResponse() {
		responseMessage_ = "";
	}

	@java.lang.Override
	@SuppressWarnings({ "unused" })
	protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
		return new APIResponse();
	}

	@java.lang.Override
	public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private APIResponse(com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		this();
		if (extensionRegistry == null) {
			throw new java.lang.NullPointerException();
		}
		com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
		try {
			boolean done = false;
			while (!done) {
				int tag = input.readTag();
				switch (tag) {
				case 0:
					done = true;
					break;
				case 10: {
					java.lang.String s = input.readStringRequireUtf8();

					responseMessage_ = s;
					break;
				}
				case 16: {

					responseCode_ = input.readInt32();
					break;
				}
				default: {
					if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
						done = true;
					}
					break;
				}
				}
			}
		} catch (com.google.protobuf.InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (java.io.IOException e) {
			throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
		} finally {
			this.unknownFields = unknownFields.build();
			makeExtensionsImmutable();
		}
	}

	public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
		return com.demo.grpc.User.internal_static_APIResponse_descriptor;
	}

	@java.lang.Override
	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return com.demo.grpc.User.internal_static_APIResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(
				com.demo.grpc.APIResponse.class, com.demo.grpc.APIResponse.Builder.class);
	}

	public static final int RESPONSEMESSAGE_FIELD_NUMBER = 1;
	private volatile java.lang.Object responseMessage_;

	/**
	 * <code>string responseMessage = 1;</code>
	 */
	public java.lang.String getResponseMessage() {
		java.lang.Object ref = responseMessage_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			responseMessage_ = s;
			return s;
		}
	}

	/**
	 * <code>string responseMessage = 1;</code>
	 */
	public com.google.protobuf.ByteString getResponseMessageBytes() {
		java.lang.Object ref = responseMessage_;
		if (ref instanceof java.lang.String) {
			com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
			responseMessage_ = b;
			return b;
		} else {
			return (com.google.protobuf.ByteString) ref;
		}
	}

	public static final int RESPONSECODE_FIELD_NUMBER = 2;
	private int responseCode_;

	/**
	 * <code>int32 responseCode = 2;</code>
	 */
	public int getResponseCode() {
		return responseCode_;
	}

	private byte memoizedIsInitialized = -1;

	@java.lang.Override
	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1)
			return true;
		if (isInitialized == 0)
			return false;

		memoizedIsInitialized = 1;
		return true;
	}

	@java.lang.Override
	public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
		if (!getResponseMessageBytes().isEmpty()) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 1, responseMessage_);
		}
		if (responseCode_ != 0) {
			output.writeInt32(2, responseCode_);
		}
		unknownFields.writeTo(output);
	}

	@java.lang.Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1)
			return size;

		size = 0;
		if (!getResponseMessageBytes().isEmpty()) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, responseMessage_);
		}
		if (responseCode_ != 0) {
			size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, responseCode_);
		}
		size += unknownFields.getSerializedSize();
		memoizedSize = size;
		return size;
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof com.demo.grpc.APIResponse)) {
			return super.equals(obj);
		}
		com.demo.grpc.APIResponse other = (com.demo.grpc.APIResponse) obj;

		if (!getResponseMessage().equals(other.getResponseMessage()))
			return false;
		if (getResponseCode() != other.getResponseCode())
			return false;
		if (!unknownFields.equals(other.unknownFields))
			return false;
		return true;
	}

	@SuppressWarnings("unchecked")
	@java.lang.Override
	public int hashCode() {
		if (memoizedHashCode != 0) {
			return memoizedHashCode;
		}
		int hash = 41;
		hash = (19 * hash) + getDescriptor().hashCode();
		hash = (37 * hash) + RESPONSEMESSAGE_FIELD_NUMBER;
		hash = (53 * hash) + getResponseMessage().hashCode();
		hash = (37 * hash) + RESPONSECODE_FIELD_NUMBER;
		hash = (53 * hash) + getResponseCode();
		hash = (29 * hash) + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	public static com.demo.grpc.APIResponse parseFrom(java.nio.ByteBuffer data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static com.demo.grpc.APIResponse parseFrom(java.nio.ByteBuffer data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static com.demo.grpc.APIResponse parseFrom(com.google.protobuf.ByteString data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static com.demo.grpc.APIResponse parseFrom(com.google.protobuf.ByteString data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static com.demo.grpc.APIResponse parseFrom(byte[] data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static com.demo.grpc.APIResponse parseFrom(byte[] data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static com.demo.grpc.APIResponse parseFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static com.demo.grpc.APIResponse parseFrom(java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.demo.grpc.APIResponse parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static com.demo.grpc.APIResponse parseDelimitedFrom(java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.demo.grpc.APIResponse parseFrom(com.google.protobuf.CodedInputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static com.demo.grpc.APIResponse parseFrom(com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(com.demo.grpc.APIResponse prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
	}

	@java.lang.Override
	protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	/**
	 * Protobuf type {@code APIResponse}
	 */
	public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:APIResponse)
			com.demo.grpc.APIResponseOrBuilder {
		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return com.demo.grpc.User.internal_static_APIResponse_descriptor;
		}

		@java.lang.Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return com.demo.grpc.User.internal_static_APIResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(
					com.demo.grpc.APIResponse.class, com.demo.grpc.APIResponse.Builder.class);
		}

		// Construct using com.demo.grpc.APIResponse.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
			}
		}

		@java.lang.Override
		public Builder clear() {
			super.clear();
			responseMessage_ = "";

			responseCode_ = 0;

			return this;
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
			return com.demo.grpc.User.internal_static_APIResponse_descriptor;
		}

		public com.demo.grpc.APIResponse getDefaultInstanceForType() {
			return com.demo.grpc.APIResponse.getDefaultInstance();
		}

		public com.demo.grpc.APIResponse build() {
			com.demo.grpc.APIResponse result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public com.demo.grpc.APIResponse buildPartial() {
			com.demo.grpc.APIResponse result = new com.demo.grpc.APIResponse(this);
			result.responseMessage_ = responseMessage_;
			result.responseCode_ = responseCode_;
			onBuilt();
			return result;
		}

		@java.lang.Override
		public Builder clone() {
			return super.clone();
		}

		@java.lang.Override
		public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
			return super.setField(field, value);
		}

		@java.lang.Override
		public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
			return super.clearField(field);
		}

		@java.lang.Override
		public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return super.clearOneof(oneof);
		}

		@java.lang.Override
		public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
				java.lang.Object value) {
			return super.setRepeatedField(field, index, value);
		}

		@java.lang.Override
		public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
			return super.addRepeatedField(field, value);
		}

		@java.lang.Override
		public Builder mergeFrom(com.google.protobuf.Message other) {
			if (other instanceof com.demo.grpc.APIResponse) {
				return mergeFrom((com.demo.grpc.APIResponse) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(com.demo.grpc.APIResponse other) {
			if (other == com.demo.grpc.APIResponse.getDefaultInstance())
				return this;
			if (!other.getResponseMessage().isEmpty()) {
				responseMessage_ = other.responseMessage_;
				onChanged();
			}
			if (other.getResponseCode() != 0) {
				setResponseCode(other.getResponseCode());
			}
			this.mergeUnknownFields(other.unknownFields);
			onChanged();
			return this;
		}

		@java.lang.Override
		public final boolean isInitialized() {
			return true;
		}

		@java.lang.Override
		public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			com.demo.grpc.APIResponse parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				parsedMessage = (com.demo.grpc.APIResponse) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		private java.lang.Object responseMessage_ = "";

		/**
		 * <code>string responseMessage = 1;</code>
		 */
		public java.lang.String getResponseMessage() {
			java.lang.Object ref = responseMessage_;
			if (!(ref instanceof java.lang.String)) {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				responseMessage_ = s;
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <code>string responseMessage = 1;</code>
		 */
		public com.google.protobuf.ByteString getResponseMessageBytes() {
			java.lang.Object ref = responseMessage_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				responseMessage_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <code>string responseMessage = 1;</code>
		 */
		public Builder setResponseMessage(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			responseMessage_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>string responseMessage = 1;</code>
		 */
		public Builder clearResponseMessage() {

			responseMessage_ = getDefaultInstance().getResponseMessage();
			onChanged();
			return this;
		}

		/**
		 * <code>string responseMessage = 1;</code>
		 */
		public Builder setResponseMessageBytes(com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			responseMessage_ = value;
			onChanged();
			return this;
		}

		private int responseCode_;

		/**
		 * <code>int32 responseCode = 2;</code>
		 */
		public int getResponseCode() {
			return responseCode_;
		}

		/**
		 * <code>int32 responseCode = 2;</code>
		 */
		public Builder setResponseCode(int value) {

			responseCode_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>int32 responseCode = 2;</code>
		 */
		public Builder clearResponseCode() {

			responseCode_ = 0;
			onChanged();
			return this;
		}

		@java.lang.Override
		public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return super.setUnknownFields(unknownFields);
		}

		@java.lang.Override
		public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return super.mergeUnknownFields(unknownFields);
		}

		// @@protoc_insertion_point(builder_scope:APIResponse)
	}

	// @@protoc_insertion_point(class_scope:APIResponse)
	private static final com.demo.grpc.APIResponse DEFAULT_INSTANCE;
	static {
		DEFAULT_INSTANCE = new com.demo.grpc.APIResponse();
	}

	public static com.demo.grpc.APIResponse getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final com.google.protobuf.Parser<APIResponse> PARSER = new com.google.protobuf.AbstractParser<APIResponse>() {
		public APIResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return new APIResponse(input, extensionRegistry);
		}
	};

	public static com.google.protobuf.Parser<APIResponse> parser() {
		return PARSER;
	}

	@java.lang.Override
	public com.google.protobuf.Parser<APIResponse> getParserForType() {
		return PARSER;
	}

	public com.demo.grpc.APIResponse getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

}
