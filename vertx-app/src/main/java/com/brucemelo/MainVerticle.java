package com.brucemelo;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) {
    vertx.createHttpServer().requestHandler(req -> {
      var student = new Student("Bru");
      var json = JsonObject.mapFrom(student);
      req.response()
        .putHeader("content-type", "application/json")
        .end(json.encode());
    }).listen(8888).onComplete(http -> {
      if (http.succeeded()) {
        startPromise.complete();
        System.out.println("HTTP server started on port 8888");
      } else {
        startPromise.fail(http.cause());
      }
    });
  }

}
