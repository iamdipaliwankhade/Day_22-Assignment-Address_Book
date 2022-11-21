import java.io.FileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import javax.swing.filechooser.FileFilter;
import com.opencsv.CSVWriter;

public class AddressBook {
	public void writeAddressBook() throws IOException {
		//System.out.println("Reading Data From CSV file");
		FileWriter outputfile = new FileWriter("C:\\Users\\Dipal\\eclipse12-workspace\\AddressBookCSV-28\\Write.csv");

		// create CSVWriter object filewriter object as parameter
		CSVWriter writer = new CSVWriter(outputfile);

		// create a List which contains String array
		ArrayList<String[]> addrsBook = new ArrayList<String[]>();
		addrsBook.add(new String[] { "FirstName", "LastName", "City", "State", "Zip", "Email" });
		addrsBook.add(new String[] { "dipali", "wankhade", "Wardha", "Maharashtra", "442201", "dipaliwankhade.com" });
		addrsBook.add(new String[] { "Tanuja", "Pande", "Pune", "Maharashtra", "413020", "tanujapande@gmail.com" });
		addrsBook.add(new String[] { "Harsh", "Pukale", "Sangli", "Maarashtra", "445521", "harsh@gmail.com" });
		writer.writeAll(addrsBook);

		writer.writeAll(addrsBook);

//	         // closing writer connection
		writer.close();

	}

	public void readAddressBook() throws IOException, Exception {

		FileReader filereader = new FileReader("C:\\Users\\Dipal\\eclipse12-workspace\\AddressBookCSV-28\\Write.csv");

		// create csvReader object and skip first Line
		CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
		List<String[]> allData = csvReader.readAll();

		// print Data
		for (String[] row : allData) {
			for (String cell : row) {
				System.out.print(cell + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) throws Exception {
		AddressBook obj = new AddressBook();
		obj.writeAddressBook();
		obj.readAddressBook();

	}

}
