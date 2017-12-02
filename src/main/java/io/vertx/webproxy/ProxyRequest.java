package io.vertx.webproxy;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.ReadStream;

import java.util.function.Function;

@VertxGen
public interface ProxyRequest {

    MultiMap headers();

    @Fluent
    ProxyRequest bodyFilter(Function<ReadStream<Buffer>, ReadStream<Buffer>> filter);

    void proxy(Handler<AsyncResult<Void>> completionHandler);

    void send(Handler<AsyncResult<ProxyResponse>> completionHandler);
}
