package com.example.sep3rest.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: logicserver.proto")
public final class PrivateFileControllerGrpc {

  private PrivateFileControllerGrpc() {}

  public static final String SERVICE_NAME = "PrivateFileController";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto,
      com.example.sep3rest.protobuf.Logicserver.PrivateFile> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "upload",
      requestType = com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.PrivateFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto,
      com.example.sep3rest.protobuf.Logicserver.PrivateFile> getUploadMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto, com.example.sep3rest.protobuf.Logicserver.PrivateFile> getUploadMethod;
    if ((getUploadMethod = PrivateFileControllerGrpc.getUploadMethod) == null) {
      synchronized (PrivateFileControllerGrpc.class) {
        if ((getUploadMethod = PrivateFileControllerGrpc.getUploadMethod) == null) {
          PrivateFileControllerGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto, com.example.sep3rest.protobuf.Logicserver.PrivateFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.PrivateFile.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateFileControllerMethodDescriptorSupplier("upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id,
      com.example.sep3rest.protobuf.Logicserver.FileDownloadDto> getDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "download",
      requestType = com.example.sep3rest.protobuf.Logicserver.Id.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.FileDownloadDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id,
      com.example.sep3rest.protobuf.Logicserver.FileDownloadDto> getDownloadMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id, com.example.sep3rest.protobuf.Logicserver.FileDownloadDto> getDownloadMethod;
    if ((getDownloadMethod = PrivateFileControllerGrpc.getDownloadMethod) == null) {
      synchronized (PrivateFileControllerGrpc.class) {
        if ((getDownloadMethod = PrivateFileControllerGrpc.getDownloadMethod) == null) {
          PrivateFileControllerGrpc.getDownloadMethod = getDownloadMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Id, com.example.sep3rest.protobuf.Logicserver.FileDownloadDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "download"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.FileDownloadDto.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateFileControllerMethodDescriptorSupplier("download"))
              .build();
        }
      }
    }
    return getDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.User,
      com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList> getGetSharedWithMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSharedWith",
      requestType = com.example.sep3rest.protobuf.Logicserver.User.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.User,
      com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList> getGetSharedWithMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.User, com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList> getGetSharedWithMethod;
    if ((getGetSharedWithMethod = PrivateFileControllerGrpc.getGetSharedWithMethod) == null) {
      synchronized (PrivateFileControllerGrpc.class) {
        if ((getGetSharedWithMethod = PrivateFileControllerGrpc.getGetSharedWithMethod) == null) {
          PrivateFileControllerGrpc.getGetSharedWithMethod = getGetSharedWithMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.User, com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSharedWith"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateFileControllerMethodDescriptorSupplier("getSharedWith"))
              .build();
        }
      }
    }
    return getGetSharedWithMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrivateFileControllerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateFileControllerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateFileControllerStub>() {
        @java.lang.Override
        public PrivateFileControllerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateFileControllerStub(channel, callOptions);
        }
      };
    return PrivateFileControllerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrivateFileControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateFileControllerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateFileControllerBlockingStub>() {
        @java.lang.Override
        public PrivateFileControllerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateFileControllerBlockingStub(channel, callOptions);
        }
      };
    return PrivateFileControllerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrivateFileControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateFileControllerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateFileControllerFutureStub>() {
        @java.lang.Override
        public PrivateFileControllerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateFileControllerFutureStub(channel, callOptions);
        }
      };
    return PrivateFileControllerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PrivateFileControllerImplBase implements io.grpc.BindableService {

    /**
     */
    public void upload(com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.PrivateFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    /**
     */
    public void download(com.example.sep3rest.protobuf.Logicserver.Id request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDownloadDto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadMethod(), responseObserver);
    }

    /**
     */
    public void getSharedWith(com.example.sep3rest.protobuf.Logicserver.User request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSharedWithMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto,
                com.example.sep3rest.protobuf.Logicserver.PrivateFile>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getDownloadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Id,
                com.example.sep3rest.protobuf.Logicserver.FileDownloadDto>(
                  this, METHODID_DOWNLOAD)))
          .addMethod(
            getGetSharedWithMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.User,
                com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList>(
                  this, METHODID_GET_SHARED_WITH)))
          .build();
    }
  }

  /**
   */
  public static final class PrivateFileControllerStub extends io.grpc.stub.AbstractAsyncStub<PrivateFileControllerStub> {
    private PrivateFileControllerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateFileControllerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateFileControllerStub(channel, callOptions);
    }

    /**
     */
    public void upload(com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.PrivateFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void download(com.example.sep3rest.protobuf.Logicserver.Id request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDownloadDto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSharedWith(com.example.sep3rest.protobuf.Logicserver.User request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSharedWithMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrivateFileControllerBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrivateFileControllerBlockingStub> {
    private PrivateFileControllerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateFileControllerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateFileControllerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.PrivateFile upload(com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.FileDownloadDto download(com.example.sep3rest.protobuf.Logicserver.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList getSharedWith(com.example.sep3rest.protobuf.Logicserver.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSharedWithMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrivateFileControllerFutureStub extends io.grpc.stub.AbstractFutureStub<PrivateFileControllerFutureStub> {
    private PrivateFileControllerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateFileControllerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateFileControllerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.PrivateFile> upload(
        com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.FileDownloadDto> download(
        com.example.sep3rest.protobuf.Logicserver.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList> getSharedWith(
        com.example.sep3rest.protobuf.Logicserver.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSharedWithMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD = 0;
  private static final int METHODID_DOWNLOAD = 1;
  private static final int METHODID_GET_SHARED_WITH = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrivateFileControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrivateFileControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD:
          serviceImpl.upload((com.example.sep3rest.protobuf.Logicserver.PrivateFileCreationDto) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.PrivateFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD:
          serviceImpl.download((com.example.sep3rest.protobuf.Logicserver.Id) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDownloadDto>) responseObserver);
          break;
        case METHODID_GET_SHARED_WITH:
          serviceImpl.getSharedWith((com.example.sep3rest.protobuf.Logicserver.User) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.PrivateFileDisplayDtoList>) responseObserver);
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

  private static abstract class PrivateFileControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrivateFileControllerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.sep3rest.protobuf.Logicserver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrivateFileController");
    }
  }

  private static final class PrivateFileControllerFileDescriptorSupplier
      extends PrivateFileControllerBaseDescriptorSupplier {
    PrivateFileControllerFileDescriptorSupplier() {}
  }

  private static final class PrivateFileControllerMethodDescriptorSupplier
      extends PrivateFileControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrivateFileControllerMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrivateFileControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrivateFileControllerFileDescriptorSupplier())
              .addMethod(getUploadMethod())
              .addMethod(getDownloadMethod())
              .addMethod(getGetSharedWithMethod())
              .build();
        }
      }
    }
    return result;
  }
}
