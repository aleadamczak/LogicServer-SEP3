package com.example.sep3rest.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: logicserver.proto")
public final class UserControllerGrpc {

  private UserControllerGrpc() {}

  public static final String SERVICE_NAME = "UserController";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.String,
      com.example.sep3rest.protobuf.Logicserver.User> getGetByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByUsername",
      requestType = com.example.sep3rest.protobuf.Logicserver.String.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.String,
      com.example.sep3rest.protobuf.Logicserver.User> getGetByUsernameMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.String, com.example.sep3rest.protobuf.Logicserver.User> getGetByUsernameMethod;
    if ((getGetByUsernameMethod = UserControllerGrpc.getGetByUsernameMethod) == null) {
      synchronized (UserControllerGrpc.class) {
        if ((getGetByUsernameMethod = UserControllerGrpc.getGetByUsernameMethod) == null) {
          UserControllerGrpc.getGetByUsernameMethod = getGetByUsernameMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.String, com.example.sep3rest.protobuf.Logicserver.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.String.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserControllerMethodDescriptorSupplier("getByUsername"))
              .build();
        }
      }
    }
    return getGetByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id,
      com.example.sep3rest.protobuf.Logicserver.User> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = com.example.sep3rest.protobuf.Logicserver.Id.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id,
      com.example.sep3rest.protobuf.Logicserver.User> getGetByIdMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id, com.example.sep3rest.protobuf.Logicserver.User> getGetByIdMethod;
    if ((getGetByIdMethod = UserControllerGrpc.getGetByIdMethod) == null) {
      synchronized (UserControllerGrpc.class) {
        if ((getGetByIdMethod = UserControllerGrpc.getGetByIdMethod) == null) {
          UserControllerGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Id, com.example.sep3rest.protobuf.Logicserver.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserControllerMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty,
      com.example.sep3rest.protobuf.Logicserver.UserList> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.example.sep3rest.protobuf.Logicserver.Empty.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.UserList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty,
      com.example.sep3rest.protobuf.Logicserver.UserList> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty, com.example.sep3rest.protobuf.Logicserver.UserList> getGetAllMethod;
    if ((getGetAllMethod = UserControllerGrpc.getGetAllMethod) == null) {
      synchronized (UserControllerGrpc.class) {
        if ((getGetAllMethod = UserControllerGrpc.getGetAllMethod) == null) {
          UserControllerGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Empty, com.example.sep3rest.protobuf.Logicserver.UserList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.UserList.getDefaultInstance()))
              .setSchemaDescriptor(new UserControllerMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.UserCreationDto,
      com.example.sep3rest.protobuf.Logicserver.User> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.example.sep3rest.protobuf.Logicserver.UserCreationDto.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.UserCreationDto,
      com.example.sep3rest.protobuf.Logicserver.User> getCreateMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.UserCreationDto, com.example.sep3rest.protobuf.Logicserver.User> getCreateMethod;
    if ((getCreateMethod = UserControllerGrpc.getCreateMethod) == null) {
      synchronized (UserControllerGrpc.class) {
        if ((getCreateMethod = UserControllerGrpc.getCreateMethod) == null) {
          UserControllerGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.UserCreationDto, com.example.sep3rest.protobuf.Logicserver.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.UserCreationDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserControllerMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.UserLogInDto,
      com.example.sep3rest.protobuf.Logicserver.User> getLogInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logIn",
      requestType = com.example.sep3rest.protobuf.Logicserver.UserLogInDto.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.UserLogInDto,
      com.example.sep3rest.protobuf.Logicserver.User> getLogInMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.UserLogInDto, com.example.sep3rest.protobuf.Logicserver.User> getLogInMethod;
    if ((getLogInMethod = UserControllerGrpc.getLogInMethod) == null) {
      synchronized (UserControllerGrpc.class) {
        if ((getLogInMethod = UserControllerGrpc.getLogInMethod) == null) {
          UserControllerGrpc.getLogInMethod = getLogInMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.UserLogInDto, com.example.sep3rest.protobuf.Logicserver.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.UserLogInDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserControllerMethodDescriptorSupplier("logIn"))
              .build();
        }
      }
    }
    return getLogInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.UserUpdateDto,
      com.example.sep3rest.protobuf.Logicserver.User> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.example.sep3rest.protobuf.Logicserver.UserUpdateDto.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.UserUpdateDto,
      com.example.sep3rest.protobuf.Logicserver.User> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.UserUpdateDto, com.example.sep3rest.protobuf.Logicserver.User> getUpdateMethod;
    if ((getUpdateMethod = UserControllerGrpc.getUpdateMethod) == null) {
      synchronized (UserControllerGrpc.class) {
        if ((getUpdateMethod = UserControllerGrpc.getUpdateMethod) == null) {
          UserControllerGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.UserUpdateDto, com.example.sep3rest.protobuf.Logicserver.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.UserUpdateDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserControllerMethodDescriptorSupplier("update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id,
      com.example.sep3rest.protobuf.Logicserver.Empty> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "remove",
      requestType = com.example.sep3rest.protobuf.Logicserver.Id.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id,
      com.example.sep3rest.protobuf.Logicserver.Empty> getRemoveMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id, com.example.sep3rest.protobuf.Logicserver.Empty> getRemoveMethod;
    if ((getRemoveMethod = UserControllerGrpc.getRemoveMethod) == null) {
      synchronized (UserControllerGrpc.class) {
        if ((getRemoveMethod = UserControllerGrpc.getRemoveMethod) == null) {
          UserControllerGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Id, com.example.sep3rest.protobuf.Logicserver.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserControllerMethodDescriptorSupplier("remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty,
      com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList> getGetAllDisplayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllDisplay",
      requestType = com.example.sep3rest.protobuf.Logicserver.Empty.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty,
      com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList> getGetAllDisplayMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty, com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList> getGetAllDisplayMethod;
    if ((getGetAllDisplayMethod = UserControllerGrpc.getGetAllDisplayMethod) == null) {
      synchronized (UserControllerGrpc.class) {
        if ((getGetAllDisplayMethod = UserControllerGrpc.getGetAllDisplayMethod) == null) {
          UserControllerGrpc.getGetAllDisplayMethod = getGetAllDisplayMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Empty, com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllDisplay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList.getDefaultInstance()))
              .setSchemaDescriptor(new UserControllerMethodDescriptorSupplier("getAllDisplay"))
              .build();
        }
      }
    }
    return getGetAllDisplayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserControllerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserControllerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserControllerStub>() {
        @java.lang.Override
        public UserControllerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserControllerStub(channel, callOptions);
        }
      };
    return UserControllerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserControllerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserControllerBlockingStub>() {
        @java.lang.Override
        public UserControllerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserControllerBlockingStub(channel, callOptions);
        }
      };
    return UserControllerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserControllerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserControllerFutureStub>() {
        @java.lang.Override
        public UserControllerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserControllerFutureStub(channel, callOptions);
        }
      };
    return UserControllerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserControllerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getByUsername(com.example.sep3rest.protobuf.Logicserver.String request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void getById(com.example.sep3rest.protobuf.Logicserver.Id request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.example.sep3rest.protobuf.Logicserver.Empty request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.UserList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void create(com.example.sep3rest.protobuf.Logicserver.UserCreationDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void logIn(com.example.sep3rest.protobuf.Logicserver.UserLogInDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogInMethod(), responseObserver);
    }

    /**
     */
    public void update(com.example.sep3rest.protobuf.Logicserver.UserUpdateDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void remove(com.example.sep3rest.protobuf.Logicserver.Id request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     */
    public void getAllDisplay(com.example.sep3rest.protobuf.Logicserver.Empty request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllDisplayMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.String,
                com.example.sep3rest.protobuf.Logicserver.User>(
                  this, METHODID_GET_BY_USERNAME)))
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Id,
                com.example.sep3rest.protobuf.Logicserver.User>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getGetAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Empty,
                com.example.sep3rest.protobuf.Logicserver.UserList>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.UserCreationDto,
                com.example.sep3rest.protobuf.Logicserver.User>(
                  this, METHODID_CREATE)))
          .addMethod(
            getLogInMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.UserLogInDto,
                com.example.sep3rest.protobuf.Logicserver.User>(
                  this, METHODID_LOG_IN)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.UserUpdateDto,
                com.example.sep3rest.protobuf.Logicserver.User>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Id,
                com.example.sep3rest.protobuf.Logicserver.Empty>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getGetAllDisplayMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Empty,
                com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList>(
                  this, METHODID_GET_ALL_DISPLAY)))
          .build();
    }
  }

  /**
   */
  public static final class UserControllerStub extends io.grpc.stub.AbstractAsyncStub<UserControllerStub> {
    private UserControllerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserControllerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserControllerStub(channel, callOptions);
    }

    /**
     */
    public void getByUsername(com.example.sep3rest.protobuf.Logicserver.String request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(com.example.sep3rest.protobuf.Logicserver.Id request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.example.sep3rest.protobuf.Logicserver.Empty request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.UserList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.example.sep3rest.protobuf.Logicserver.UserCreationDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logIn(com.example.sep3rest.protobuf.Logicserver.UserLogInDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.example.sep3rest.protobuf.Logicserver.UserUpdateDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void remove(com.example.sep3rest.protobuf.Logicserver.Id request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllDisplay(com.example.sep3rest.protobuf.Logicserver.Empty request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllDisplayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserControllerBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserControllerBlockingStub> {
    private UserControllerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserControllerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserControllerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.User getByUsername(com.example.sep3rest.protobuf.Logicserver.String request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.User getById(com.example.sep3rest.protobuf.Logicserver.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.UserList getAll(com.example.sep3rest.protobuf.Logicserver.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.User create(com.example.sep3rest.protobuf.Logicserver.UserCreationDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.User logIn(com.example.sep3rest.protobuf.Logicserver.UserLogInDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.User update(com.example.sep3rest.protobuf.Logicserver.UserUpdateDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.Empty remove(com.example.sep3rest.protobuf.Logicserver.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList getAllDisplay(com.example.sep3rest.protobuf.Logicserver.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllDisplayMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserControllerFutureStub extends io.grpc.stub.AbstractFutureStub<UserControllerFutureStub> {
    private UserControllerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserControllerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserControllerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.User> getByUsername(
        com.example.sep3rest.protobuf.Logicserver.String request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.User> getById(
        com.example.sep3rest.protobuf.Logicserver.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.UserList> getAll(
        com.example.sep3rest.protobuf.Logicserver.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.User> create(
        com.example.sep3rest.protobuf.Logicserver.UserCreationDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.User> logIn(
        com.example.sep3rest.protobuf.Logicserver.UserLogInDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.User> update(
        com.example.sep3rest.protobuf.Logicserver.UserUpdateDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.Empty> remove(
        com.example.sep3rest.protobuf.Logicserver.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList> getAllDisplay(
        com.example.sep3rest.protobuf.Logicserver.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllDisplayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_USERNAME = 0;
  private static final int METHODID_GET_BY_ID = 1;
  private static final int METHODID_GET_ALL = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_LOG_IN = 4;
  private static final int METHODID_UPDATE = 5;
  private static final int METHODID_REMOVE = 6;
  private static final int METHODID_GET_ALL_DISPLAY = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_USERNAME:
          serviceImpl.getByUsername((com.example.sep3rest.protobuf.Logicserver.String) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((com.example.sep3rest.protobuf.Logicserver.Id) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.example.sep3rest.protobuf.Logicserver.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.UserList>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.example.sep3rest.protobuf.Logicserver.UserCreationDto) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User>) responseObserver);
          break;
        case METHODID_LOG_IN:
          serviceImpl.logIn((com.example.sep3rest.protobuf.Logicserver.UserLogInDto) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.example.sep3rest.protobuf.Logicserver.UserUpdateDto) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.User>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((com.example.sep3rest.protobuf.Logicserver.Id) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Empty>) responseObserver);
          break;
        case METHODID_GET_ALL_DISPLAY:
          serviceImpl.getAllDisplay((com.example.sep3rest.protobuf.Logicserver.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.UserDisplayDtoList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserControllerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.sep3rest.protobuf.Logicserver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserController");
    }
  }

  private static final class UserControllerFileDescriptorSupplier
      extends UserControllerBaseDescriptorSupplier {
    UserControllerFileDescriptorSupplier() {}
  }

  private static final class UserControllerMethodDescriptorSupplier
      extends UserControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserControllerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserControllerFileDescriptorSupplier())
              .addMethod(getGetByUsernameMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getCreateMethod())
              .addMethod(getLogInMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getRemoveMethod())
              .addMethod(getGetAllDisplayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
