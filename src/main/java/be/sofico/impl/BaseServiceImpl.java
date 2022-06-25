package be.sofico.impl;

import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.NotFoundException;
import be.sofico.api.request.FindBookRequest;
import be.sofico.api.response.Book;
import be.sofico.api.response.FindBookResponse;
import be.sofico.connector.BaseService;
import be.sofico.util.BookConverter;
import be.sofico.util.FindBookConverter;
import be.sofico.util.external.BookFactory;
import be.sofico.util.external.FindBookFactory;

@ApplicationScoped
public class BaseServiceImpl implements BaseService {

	@Override
	public FindBookResponse findBooks(FindBookRequest findBookRequest) {
		FindBookResponse findBookResponse = new FindBookResponse();
		findBookResponse.books = FindBookFactory.getAllBooks()
				.stream()
				.map(FindBookConverter::convertDto)
				.collect(Collectors.toList());
		findBookResponse.totalCount = (long) findBookResponse.books.size();
		return findBookResponse;
	}

	@Override
	public Book getBook(String isbn) {
		Book book = new Book();

		be.sofico.util.external.Book engineBook = BookFactory.getAllBooks()
				.stream()
				.filter(b -> b.isbn.equals(isbn))
				.findFirst()
				.orElse(null);

		if (engineBook == null) {
			throw new NotFoundException();
		}

		return BookConverter.convertDto(engineBook);
	}
}
