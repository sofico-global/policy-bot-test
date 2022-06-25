package be.sofico.connector;

import be.sofico.api.request.FindBookRequest;
import be.sofico.api.response.Book;
import be.sofico.api.response.FindBookResponse;

public interface BaseService {

	FindBookResponse findBooks(FindBookRequest findBookRequest);

	Book getBook(String isbn);

}
