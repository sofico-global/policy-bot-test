package be.sofico.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import be.sofico.api.request.FindBookRequest;
import be.sofico.api.response.Book;
import be.sofico.api.response.FindBookResponse;

@Path("/")
public interface BaseResourceAPI {

	@GET
	@Path("books")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public FindBookResponse findBooks(
			FindBookRequest findBookRequest
	);


	@GET
	@Path("books/{isbn}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Book getBook(
			@PathParam("isbn")
			String isbn
	);

}