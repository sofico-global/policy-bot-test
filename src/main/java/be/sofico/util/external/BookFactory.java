package be.sofico.util.external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import be.sofico.api.response.Author;

public class BookFactory {

	public static List<Book> getAllBooks() {
		return new ArrayList<>(Arrays.asList(
				new Book() {
					{
						isbn = "9780349402451";
						description = "The Benson";
						releaseYear = "2011";
						author = new Author() {
							{
								firstName = "Karina";
								lastName = "Halle";
							}
						};
					}
				},
				new Book() {
					{
						isbn = "9780349402482";
						description = "Dead Sky Morning";
						releaseYear = "2011";
						author = new Author() {
							{
								firstName = "Karina";
								lastName = "Halle";
							}
						};
					}
				},
				new Book() {
					{
						isbn = "9780356506081";
						description = "Speak: A Novel";
						releaseYear = "2015";
						author = new Author() {
							{
								firstName = "Louisa";
								lastName = "Hall";
							}
						};
					}
				},
				new Book() {
					{
						isbn = "9781496726049";
						description = "Murder at a Scottish Social";
						releaseYear = "2022";
						author = new Author() {
							{
								firstName = "Traci";
								lastName = "Hall";
							}
						};
					}
				},
				new Book() {
					{
						isbn = "9781426847295";
						description = "The Wizard's Ward";
						releaseYear = "2004";
						author = new Author() {
							{
								firstName = "Deborah";
								lastName = "Hale ";
							}
						};
					}
				}
		));
	}

}
