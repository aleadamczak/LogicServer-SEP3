package com.example.sep3rest.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: logicserver.proto")
public final class CategoryControllerGrpc {

  private CategoryControllerGrpc() {}

  public static final String SERVICE_NAME = "CategoryController";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category,
      com.example.sep3rest.protobuf.Logicserver.Category> getAddCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCategory",
      requestType = com.example.sep3rest.protobuf.Logicserver.Category.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category,
      com.example.sep3rest.protobuf.Logicserver.Category> getAddCategoryMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category, com.example.sep3rest.protobuf.Logicserver.Category> getAddCategoryMethod;
    if ((getAddCategoryMethod = CategoryControllerGrpc.getAddCategoryMethod) == null) {
      synchronized (CategoryControllerGrpc.class) {
        if ((getAddCategoryMethod = CategoryControllerGrpc.getAddCategoryMethod) == null) {
          CategoryControllerGrpc.getAddCategoryMethod = getAddCategoryMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Category, com.example.sep3rest.protobuf.Logicserver.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Category.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Category.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryControllerMethodDescriptorSupplier("addCategory"))
              .build();
        }
      }
    }
    return getAddCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category,
      com.example.sep3rest.protobuf.Logicserver.Empty> getRemoveCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeCategory",
      requestType = com.example.sep3rest.protobuf.Logicserver.Category.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category,
      com.example.sep3rest.protobuf.Logicserver.Empty> getRemoveCategoryMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category, com.example.sep3rest.protobuf.Logicserver.Empty> getRemoveCategoryMethod;
    if ((getRemoveCategoryMethod = CategoryControllerGrpc.getRemoveCategoryMethod) == null) {
      synchronized (CategoryControllerGrpc.class) {
        if ((getRemoveCategoryMethod = CategoryControllerGrpc.getRemoveCategoryMethod) == null) {
          CategoryControllerGrpc.getRemoveCategoryMethod = getRemoveCategoryMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Category, com.example.sep3rest.protobuf.Logicserver.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Category.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryControllerMethodDescriptorSupplier("removeCategory"))
              .build();
        }
      }
    }
    return getRemoveCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty,
      com.example.sep3rest.protobuf.Logicserver.CategoryList> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.example.sep3rest.protobuf.Logicserver.Empty.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.CategoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty,
      com.example.sep3rest.protobuf.Logicserver.CategoryList> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Empty, com.example.sep3rest.protobuf.Logicserver.CategoryList> getGetAllMethod;
    if ((getGetAllMethod = CategoryControllerGrpc.getGetAllMethod) == null) {
      synchronized (CategoryControllerGrpc.class) {
        if ((getGetAllMethod = CategoryControllerGrpc.getGetAllMethod) == null) {
          CategoryControllerGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Empty, com.example.sep3rest.protobuf.Logicserver.CategoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.CategoryList.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryControllerMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category,
      com.example.sep3rest.protobuf.Logicserver.Category> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.example.sep3rest.protobuf.Logicserver.Category.class,
      responseType = com.example.sep3rest.protobuf.Logicserver.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category,
      com.example.sep3rest.protobuf.Logicserver.Category> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.example.sep3rest.protobuf.Logicserver.Category, com.example.sep3rest.protobuf.Logicserver.Category> getUpdateMethod;
    if ((getUpdateMethod = CategoryControllerGrpc.getUpdateMethod) == null) {
      synchronized (CategoryControllerGrpc.class) {
        if ((getUpdateMethod = CategoryControllerGrpc.getUpdateMethod) == null) {
          CategoryControllerGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.example.sep3rest.protobuf.Logicserver.Category, com.example.sep3rest.protobuf.Logicserver.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Category.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.sep3rest.protobuf.Logicserver.Category.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryControllerMethodDescriptorSupplier("update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CategoryControllerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryControllerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryControllerStub>() {
        @java.lang.Override
        public CategoryControllerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryControllerStub(channel, callOptions);
        }
      };
    return CategoryControllerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CategoryControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryControllerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryControllerBlockingStub>() {
        @java.lang.Override
        public CategoryControllerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryControllerBlockingStub(channel, callOptions);
        }
      };
    return CategoryControllerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CategoryControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryControllerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryControllerFutureStub>() {
        @java.lang.Override
        public CategoryControllerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryControllerFutureStub(channel, callOptions);
        }
      };
    return CategoryControllerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CategoryControllerImplBase implements io.grpc.BindableService {

    /**
     */
    public void addCategory(com.example.sep3rest.protobuf.Logicserver.Category request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCategoryMethod(), responseObserver);
    }

    /**
     */
    public void removeCategory(com.example.sep3rest.protobuf.Logicserver.Category request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveCategoryMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.example.sep3rest.protobuf.Logicserver.Empty request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.CategoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void update(com.example.sep3rest.protobuf.Logicserver.Category request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Category,
                com.example.sep3rest.protobuf.Logicserver.Category>(
                  this, METHODID_ADD_CATEGORY)))
          .addMethod(
            getRemoveCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Category,
                com.example.sep3rest.protobuf.Logicserver.Empty>(
                  this, METHODID_REMOVE_CATEGORY)))
          .addMethod(
            getGetAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Empty,
                com.example.sep3rest.protobuf.Logicserver.CategoryList>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.sep3rest.protobuf.Logicserver.Category,
                com.example.sep3rest.protobuf.Logicserver.Category>(
                  this, METHODID_UPDATE)))
          .build();
    }
  }

  /**
   */
  public static final class CategoryControllerStub extends io.grpc.stub.AbstractAsyncStub<CategoryControllerStub> {
    private CategoryControllerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryControllerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryControllerStub(channel, callOptions);
    }

    /**
     */
    public void addCategory(com.example.sep3rest.protobuf.Logicserver.Category request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeCategory(com.example.sep3rest.protobuf.Logicserver.Category request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.example.sep3rest.protobuf.Logicserver.Empty request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.CategoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.example.sep3rest.protobuf.Logicserver.Category request,
        io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CategoryControllerBlockingStub extends io.grpc.stub.AbstractBlockingStub<CategoryControllerBlockingStub> {
    private CategoryControllerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryControllerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryControllerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.Category addCategory(com.example.sep3rest.protobuf.Logicserver.Category request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.Empty removeCategory(com.example.sep3rest.protobuf.Logicserver.Category request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.CategoryList getAll(com.example.sep3rest.protobuf.Logicserver.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.sep3rest.protobuf.Logicserver.Category update(com.example.sep3rest.protobuf.Logicserver.Category request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CategoryControllerFutureStub extends io.grpc.stub.AbstractFutureStub<CategoryControllerFutureStub> {
    private CategoryControllerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryControllerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryControllerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.Category> addCategory(
        com.example.sep3rest.protobuf.Logicserver.Category request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.Empty> removeCategory(
        com.example.sep3rest.protobuf.Logicserver.Category request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.CategoryList> getAll(
        com.example.sep3rest.protobuf.Logicserver.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.sep3rest.protobuf.Logicserver.Category> update(
        com.example.sep3rest.protobuf.Logicserver.Category request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CATEGORY = 0;
  private static final int METHODID_REMOVE_CATEGORY = 1;
  private static final int METHODID_GET_ALL = 2;
  private static final int METHODID_UPDATE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CategoryControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CategoryControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CATEGORY:
          serviceImpl.addCategory((com.example.sep3rest.protobuf.Logicserver.Category) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Category>) responseObserver);
          break;
        case METHODID_REMOVE_CATEGORY:
          serviceImpl.removeCategory((com.example.sep3rest.protobuf.Logicserver.Category) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Empty>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.example.sep3rest.protobuf.Logicserver.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.CategoryList>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.example.sep3rest.protobuf.Logicserver.Category) request,
              (io.grpc.stub.StreamObserver<com.example.sep3rest.protobuf.Logicserver.Category>) responseObserver);
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

  private static abstract class CategoryControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CategoryControllerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.sep3rest.protobuf.Logicserver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CategoryController");
    }
  }

  private static final class CategoryControllerFileDescriptorSupplier
      extends CategoryControllerBaseDescriptorSupplier {
    CategoryControllerFileDescriptorSupplier() {}
  }

  private static final class CategoryControllerMethodDescriptorSupplier
      extends CategoryControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CategoryControllerMethodDescriptorSupplier(String methodName) {
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
      synchronized (CategoryControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CategoryControllerFileDescriptorSupplier())
              .addMethod(getAddCategoryMethod())
              .addMethod(getRemoveCategoryMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
