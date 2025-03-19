import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class SimulationApp extends Simulation {

    HttpProtocolBuilder httpProtocol =
            http.baseUrl("http://localhost:8080")
                    .acceptHeader("application/json")
                    .contentTypeHeader("application/json")
                    .maxConnectionsPerHost(3000)
                    .shareConnections();

    ScenarioBuilder scenario = scenario("Scenario1")
            .exec(http("Request1").get("/")
                    .check(status().is(200)));

    {
        setUp(
                scenario.injectClosed(constantConcurrentUsers(5000).during(10)
                ).protocols(httpProtocol)
        );
    }

}