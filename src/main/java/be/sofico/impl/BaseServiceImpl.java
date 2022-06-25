package be.sofico.impl;

import javax.enterprise.context.ApplicationScoped;
import be.sofico.api.request.FindBookRequest;
import be.sofico.api.response.Book;
import be.sofico.api.response.FindBookResponse;
import be.sofico.connector.BaseService;

@ApplicationScoped
public class BaseServiceImpl implements BaseService {

	@Override
	public FindBookResponse findBooks(FindBookRequest findBookRequest) {
		return null;
	}

	@Override
	public Book getBook(String isbn) {
		return null;
	}
}
