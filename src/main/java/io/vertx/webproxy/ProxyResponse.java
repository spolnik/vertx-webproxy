package io.vertx.webproxy;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpClientResponse;
import io.vertx.core.streams.ReadStream;

import java.util.function.Function;

@VertxGen
public interface ProxyResponse {

    int statusCode();

    String statusMessage();

    boolean publicCacheControl();

    long maxAge();

    String etag();

    MultiMap headers();

    @Fluent
    ProxyResponse bodyFilter(Function<ReadStream<Buffer>, ReadStream<Buffer>> filter);

    @Fluent
    ProxyResponse set(HttpClientResponse response);

    void send(Handler<AsyncResult<Void>> completionHandler);

    void cancel();
}
