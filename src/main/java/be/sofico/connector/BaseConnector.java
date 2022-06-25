package be.sofico.connector;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import be.sofico.api.BaseResourceAPI;
import be.sofico.api.request.FindBookRequest;
import be.sofico.api.response.Book;
import be.sofico.api.response.FindBookResponse;

@ApplicationScoped
public class BaseConnector implements BaseResourceAPI {

	@Inject
	BaseService baseService;

	@Override
	public FindBookResponse findBooks(FindBookRequest findBookRequest) {
		return baseService.findBooks(findBookRequest);
	}

	@Override
	public Book getBook(String isbn) {
		return baseService.getBook(isbn);
	}
}
