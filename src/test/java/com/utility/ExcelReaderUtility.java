package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojo.User;

public class ExcelReaderUtility {

	@SuppressWarnings("null")
	public static Iterator<User> readExcelFile(String fileName) {

		File xlsxFile = new File(System.getProperty("user.dir") + "//testdata//" +fileName);
		XSSFWorkbook xssfWorkBook;
		XSSFSheet xssfsheet;
		Iterator<Row> rowIterator;
		List<User> userList = null;
		Row row;
		Cell emailAddressCell;
		Cell passwordCell;
		User user;

		try {
			xssfWorkBook = new XSSFWorkbook(xlsxFile);
			userList = new ArrayList<User>();
			xssfsheet = xssfWorkBook.getSheet("LoginTestData");
			rowIterator = xssfsheet.iterator();
			row = rowIterator.next();

			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				emailAddressCell = row.getCell(0);
				passwordCell = row.getCell(1);
				user = new User(emailAddressCell.toString(), passwordCell.toString());
				System.out.println(user.toString());
				userList.add(user);
				xssfWorkBook.close();


			}
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userList.iterator();

	}

}
