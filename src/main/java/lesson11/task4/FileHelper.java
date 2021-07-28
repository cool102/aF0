package lesson11.task4;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    public static List<Person> getPersonsFromExcel(String path, String sheetName) {
        Workbook excelfile = openExcelFile(path);
        if (excelfile == null)
            return null;
        Sheet sheet = excelfile.getSheet(sheetName);
        if (sheet == null)
            return null;

        return RowsToPersonList(sheet);

    }

    public static List<Person> RowsToPersonList(Sheet sheet) {
        List<Person> persons = new ArrayList<>();

        for (Row row : sheet) {
            try {
                String lastName = row.getCell(0).getStringCellValue();
                String firstName = row.getCell(1).getStringCellValue();
                String patronymic = row.getCell(2).getStringCellValue();
                String stringBirthDate = row.getCell(3).getStringCellValue();
                LocalDate birthDate = getParse(stringBirthDate);
                String serial = row.getCell(4).getStringCellValue();
                String number = row.getCell(5).getStringCellValue();
                Passport passport = new Passport(serial, number);
                Person person = new Person(lastName, firstName, patronymic, birthDate, passport);
                persons.add(person);
            } catch (Exception e) {
                continue;
            }

        }
        return persons;
    }

    public static LocalDate getParse(String stringBirthDate) {
        return LocalDate.parse(stringBirthDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }


    public static Workbook openExcelFile(String path) {
        try {
            FileInputStream file = new FileInputStream(new File(path));
            return new XSSFWorkbook(file);

        } catch (Exception e) {
            return null;

        }


    }
}

