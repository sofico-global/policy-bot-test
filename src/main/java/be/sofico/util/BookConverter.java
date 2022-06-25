package be.sofico.util;

import be.sofico.api.response.Author;
import be.sofico.api.response.Book;

public class BookConverter {

	public static Book convertDto(be.sofico.util.external.Book entity) {
		if (entity == null) {
			return null;
		}

		Book book = new Book();
		book.isbn = entity.isbn;
		book.description = entity.description;
		book.releaseYear = entity.releaseYear;

		if (entity.author != null) {
			Author author = new Author();
			author.lastName = entity.author.lastName;
			author.firstName = entity.author.firstName;

			book.author = author;
		}

		return book;
	}

}
