package io.vertx.webproxy.impl;

import io.vertx.core.http.HttpClientResponse;

public interface CachedHttpClientResponse extends HttpClientResponse {

  void send();
}
