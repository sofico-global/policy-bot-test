package be.sofico.util.external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindBookFactory {

	public static List<FindBook> getAllBooks() {
		return new ArrayList<>(Arrays.asList(
				new FindBook() {
					{
						isbn = "9780349402451";
						description = "The Benson";
						releaseYear = "2011";
					}
				},
				new FindBook() {
					{
						isbn = "9780349402482";
						description = "Dead Sky Morning";
						releaseYear = "2011";
					}
				},
				new FindBook() {
					{
						isbn = "9780356506081";
						description = "Speak: A Novel";
						releaseYear = "2015";
					}
				},
				new FindBook() {
					{
						isbn = "9781496726049";
						description = "Murder at a Scottish Social";
						releaseYear = "2022";
					}
				},
				new FindBook() {
					{
						isbn = "9781426847295";
						description = "The Wizard's Ward";
						releaseYear = "2004";
					}
				}
		));
	}

}
