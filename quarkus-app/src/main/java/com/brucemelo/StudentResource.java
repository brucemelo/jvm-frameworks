package com.brucemelo;

import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@RunOnVirtualThread
@Produces(MediaType.APPLICATION_JSON)
public class StudentResource {

    @GET
    public Student get() {
        return new Student("Tom");
    }
}
