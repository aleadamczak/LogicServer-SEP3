package com.example.sep3rest.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: logicserver.proto")
public final class FileControllerGrpc {

  private FileControllerGrpc() {}

  public static final String SERVICE_NAME = "FileController";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.FileCreationDto,
      com.example.sep3rest.protobuf.Logicserver.File> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "upload",
      requestType = com.example.sep3rest.protobuf.Logicserver.FileCreationDto.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.File.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.FileCreationDto,
      com.example.sep3rest.protobuf.Logicserver.File> getUploadMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.FileCreationDto, com.example.sep3rest.protobuf.Logicserver.File> getUploadMethod;
    if ((getUploadMethod = FileControllerGrpc.getUploadMethod) == null) {
      synchronized (FileControllerGrpc.class) {
        if ((getUploadMethod = FileControllerGrpc.getUploadMethod) == null) {
          FileControllerGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.FileCreationDto, com.example.sep3rest.protobuf.Logicserver.File>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.FileCreationDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.File.getDefaultInstance()))
              .setSchemaDescriptor(new FileControllerMethodDescriptorSupplier("upload"))
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
    if ((getDownloadMethod = FileControllerGrpc.getDownloadMethod) == null) {
      synchronized (FileControllerGrpc.class) {
        if ((getDownloadMethod = FileControllerGrpc.getDownloadMethod) == null) {
          FileControllerGrpc.getDownloadMethod = getDownloadMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Id, com.example.sep3rest.protobuf.Logicserver.FileDownloadDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "download"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.FileDownloadDto.getDefaultInstance()))
              .setSchemaDescriptor(new FileControllerMethodDescriptorSupplier("download"))
              .build();
        }
      }
    }
    return getDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty,
      com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.example.sep3rest.protobuf.Logicserver.Empty.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.FileDisplayList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty,
      com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty, com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getGetAllMethod;
    if ((getGetAllMethod = FileControllerGrpc.getGetAllMethod) == null) {
      synchronized (FileControllerGrpc.class) {
        if ((getGetAllMethod = FileControllerGrpc.getGetAllMethod) == null) {
          FileControllerGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Empty, com.example.sep3rest.protobuf.Logicserver.FileDisplayList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.FileDisplayList.getDefaultInstance()))
              .setSchemaDescriptor(new FileControllerMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id,
      com.example.sep3rest.protobuf.Logicserver.File> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = com.example.sep3rest.protobuf.Logicserver.Id.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.File.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id,
      com.example.sep3rest.protobuf.Logicserver.File> getGetByIdMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Id, com.example.sep3rest.protobuf.Logicserver.File> getGetByIdMethod;
    if ((getGetByIdMethod = FileControllerGrpc.getGetByIdMethod) == null) {
      synchronized (FileControllerGrpc.class) {
        if ((getGetByIdMethod = FileControllerGrpc.getGetByIdMethod) == null) {
          FileControllerGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Id, com.example.sep3rest.protobuf.Logicserver.File>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.File.getDefaultInstance()))
              .setSchemaDescriptor(new FileControllerMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category,
      com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getGetByCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByCategory",
      requestType = com.example.sep3rest.protobuf.Logicserver.Category.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.FileDisplayList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category,
      com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getGetByCategoryMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category, com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getGetByCategoryMethod;
    if ((getGetByCategoryMethod = FileControllerGrpc.getGetByCategoryMethod) == null) {
      synchronized (FileControllerGrpc.class) {
        if ((getGetByCategoryMethod = FileControllerGrpc.getGetByCategoryMethod) == null) {
          FileControllerGrpc.getGetByCategoryMethod = getGetByCategoryMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Category, com.example.sep3rest.protobuf.Logicserver.FileDisplayList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Category.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.FileDisplayList.getDefaultInstance()))
              .setSchemaDescriptor(new FileControllerMethodDescriptorSupplier("getByCategory"))
              .build();
        }
      }
    }
    return getGetByCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.String,
      com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getGetByTitleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByTitle",
      requestType = com.example.sep3rest.protobuf.Logicserver.String.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.FileDisplayList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.String,
      com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getGetByTitleMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.String, com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getGetByTitleMethod;
    if ((getGetByTitleMethod = FileControllerGrpc.getGetByTitleMethod) == null) {
      synchronized (FileControllerGrpc.class) {
        if ((getGetByTitleMethod = FileControllerGrpc.getGetByTitleMethod) == null) {
          FileControllerGrpc.getGetByTitleMethod = getGetByTitleMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.String, com.example.sep3rest.protobuf.Logicserver.FileDisplayList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByTitle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.String.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.FileDisplayList.getDefaultInstance()))
              .setSchemaDescriptor(new FileControllerMethodDescriptorSupplier("getByTitle"))
              .build();
        }
      }
    }
    return getGetByTitleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.FileUpdateDto,
      com.example.sep3rest.protobuf.Logicserver.File> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.example.sep3rest.protobuf.Logicserver.FileUpdateDto.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.File.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.FileUpdateDto,
      com.example.sep3rest.protobuf.Logicserver.File> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.FileUpdateDto, com.example.sep3rest.protobuf.Logicserver.File> getUpdateMethod;
    if ((getUpdateMethod = FileControllerGrpc.getUpdateMethod) == null) {
      synchronized (FileControllerGrpc.class) {
        if ((getUpdateMethod = FileControllerGrpc.getUpdateMethod) == null) {
          FileControllerGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.FileUpdateDto, com.example.sep3rest.protobuf.Logicserver.File>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.FileUpdateDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.File.getDefaultInstance()))
              .setSchemaDescriptor(new FileControllerMethodDescriptorSupplier("update"))
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
    if ((getRemoveMethod = FileControllerGrpc.getRemoveMethod) == null) {
      synchronized (FileControllerGrpc.class) {
        if ((getRemoveMethod = FileControllerGrpc.getRemoveMethod) == null) {
          FileControllerGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Id, com.example.sep3rest.protobuf.Logicserver.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FileControllerMethodDescriptorSupplier("remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileControllerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileControllerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileControllerStub>() {
        @java.lang.Override
        public FileControllerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileControllerStub(channel, callOptions);
        }
      };
    return FileControllerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileControllerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileControllerBlockingStub>() {
        @java.lang.Override
        public FileControllerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileControllerBlockingStub(channel, callOptions);
        }
      };
    return FileControllerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileControllerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileControllerFutureStub>() {
        @java.lang.Override
        public FileControllerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileControllerFutureStub(channel, callOptions);
        }
      };
    return FileControllerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FileControllerImplBase implements io.grpc.BindableService {

    /**
     */
    public void upload(com.example.sep3rest.protobuf.Logicserver.FileCreationDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.File> responseObserver) {
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
    public void getAll(com.example.sep3rest.protobuf.Logicserver.Empty request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDisplayList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getById(com.example.sep3rest.protobuf.Logicserver.Id request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.File> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void getByCategory(com.example.sep3rest.protobuf.Logicserver.Category request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDisplayList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByCategoryMethod(), responseObserver);
    }

    /**
     */
    public void getByTitle(com.example.sep3rest.protobuf.Logicserver.String request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDisplayList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByTitleMethod(), responseObserver);
    }

    /**
     */
    public void update(com.example.sep3rest.protobuf.Logicserver.FileUpdateDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.File> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void remove(com.example.sep3rest.protobuf.Logicserver.Id request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.FileCreationDto,
                com.example.sep3rest.protobuf.Logicserver.File>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getDownloadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Id,
                com.example.sep3rest.protobuf.Logicserver.FileDownloadDto>(
                  this, METHODID_DOWNLOAD)))
          .addMethod(
            getGetAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Empty,
                com.example.sep3rest.protobuf.Logicserver.FileDisplayList>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Id,
                com.example.sep3rest.protobuf.Logicserver.File>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getGetByCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Category,
                com.example.sep3rest.protobuf.Logicserver.FileDisplayList>(
                  this, METHODID_GET_BY_CATEGORY)))
          .addMethod(
            getGetByTitleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.String,
                com.example.sep3rest.protobuf.Logicserver.FileDisplayList>(
                  this, METHODID_GET_BY_TITLE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.FileUpdateDto,
                com.example.sep3rest.protobuf.Logicserver.File>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Id,
                com.example.sep3rest.protobuf.Logicserver.Empty>(
                  this, METHODID_REMOVE)))
          .build();
    }
  }

  /**
   */
  public static final class FileControllerStub extends io.grpc.stub.AbstractAsyncStub<FileControllerStub> {
    private FileControllerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileControllerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileControllerStub(channel, callOptions);
    }

    /**
     */
    public void upload(com.example.sep3rest.protobuf.Logicserver.FileCreationDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.File> responseObserver) {
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
    public void getAll(com.example.sep3rest.protobuf.Logicserver.Empty request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDisplayList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(com.example.sep3rest.protobuf.Logicserver.Id request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.File> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByCategory(com.example.sep3rest.protobuf.Logicserver.Category request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDisplayList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByTitle(com.example.sep3rest.protobuf.Logicserver.String request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDisplayList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByTitleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.example.sep3rest.protobuf.Logicserver.FileUpdateDto request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.File> responseObserver) {
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
  }

  /**
   */
  public static final class FileControllerBlockingStub extends io.grpc.stub.AbstractBlockingStub<FileControllerBlockingStub> {
    private FileControllerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileControllerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileControllerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.File upload(com.example.sep3rest.protobuf.Logicserver.FileCreationDto request) {
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
    public com.example.sep3rest.protobuf.Logicserver.FileDisplayList getAll(com.example.sep3rest.protobuf.Logicserver.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.File getById(com.example.sep3rest.protobuf.Logicserver.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.FileDisplayList getByCategory(com.example.sep3rest.protobuf.Logicserver.Category request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.FileDisplayList getByTitle(com.example.sep3rest.protobuf.Logicserver.String request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByTitleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.File update(com.example.sep3rest.protobuf.Logicserver.FileUpdateDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.Empty remove(com.example.sep3rest.protobuf.Logicserver.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FileControllerFutureStub extends io.grpc.stub.AbstractFutureStub<FileControllerFutureStub> {
    private FileControllerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileControllerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileControllerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.File> upload(
        com.example.sep3rest.protobuf.Logicserver.FileCreationDto request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getAll(
        com.example.sep3rest.protobuf.Logicserver.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.File> getById(
        com.example.sep3rest.protobuf.Logicserver.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getByCategory(
        com.example.sep3rest.protobuf.Logicserver.Category request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.FileDisplayList> getByTitle(
        com.example.sep3rest.protobuf.Logicserver.String request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByTitleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.File> update(
        com.example.sep3rest.protobuf.Logicserver.FileUpdateDto request) {
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
  }

  private static final int METHODID_UPLOAD = 0;
  private static final int METHODID_DOWNLOAD = 1;
  private static final int METHODID_GET_ALL = 2;
  private static final int METHODID_GET_BY_ID = 3;
  private static final int METHODID_GET_BY_CATEGORY = 4;
  private static final int METHODID_GET_BY_TITLE = 5;
  private static final int METHODID_UPDATE = 6;
  private static final int METHODID_REMOVE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD:
          serviceImpl.upload((com.example.sep3rest.protobuf.Logicserver.FileCreationDto) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.File>) responseObserver);
          break;
        case METHODID_DOWNLOAD:
          serviceImpl.download((com.example.sep3rest.protobuf.Logicserver.Id) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDownloadDto>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.example.sep3rest.protobuf.Logicserver.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDisplayList>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((com.example.sep3rest.protobuf.Logicserver.Id) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.File>) responseObserver);
          break;
        case METHODID_GET_BY_CATEGORY:
          serviceImpl.getByCategory((com.example.sep3rest.protobuf.Logicserver.Category) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDisplayList>) responseObserver);
          break;
        case METHODID_GET_BY_TITLE:
          serviceImpl.getByTitle((com.example.sep3rest.protobuf.Logicserver.String) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.FileDisplayList>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.example.sep3rest.protobuf.Logicserver.FileUpdateDto) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.File>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((com.example.sep3rest.protobuf.Logicserver.Id) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Empty>) responseObserver);
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

  private static abstract class FileControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileControllerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.sep3rest.protobuf.Logicserver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileController");
    }
  }

  private static final class FileControllerFileDescriptorSupplier
      extends FileControllerBaseDescriptorSupplier {
    FileControllerFileDescriptorSupplier() {}
  }

  private static final class FileControllerMethodDescriptorSupplier
      extends FileControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileControllerMethodDescriptorSupplier(String methodName) {
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
      synchronized (FileControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileControllerFileDescriptorSupplier())
              .addMethod(getUploadMethod())
              .addMethod(getDownloadMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getGetByCategoryMethod())
              .addMethod(getGetByTitleMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getRemoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
