package be.sofico.util;

import be.sofico.api.response.FindBook;

public class FindBookConverter {

	public static FindBook convertDto(be.sofico.util.external.FindBook entity) {
		if (entity == null) {
			return null;
		}

		FindBook findBook = new FindBook();
		findBook.isbn = entity.isbn;
		findBook.description = entity.description;
		findBook.releaseYear = entity.releaseYear;

		return findBook;
	}

}
