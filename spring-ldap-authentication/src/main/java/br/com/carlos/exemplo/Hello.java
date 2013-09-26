package br.com.carlos.exemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Path("/hello")
@Component
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String print() {
		return "Hello Jersey";
	}

}
