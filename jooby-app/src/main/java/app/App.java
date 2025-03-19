package app;

import io.jooby.Jooby;
import io.jooby.avaje.jsonb.AvajeJsonbModule;
import io.jooby.netty.NettyServer;

public class App extends Jooby {

  {
    install(new NettyServer());
    install(new AvajeJsonbModule());
    get("/", ctx -> new Student("Bru"));
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
