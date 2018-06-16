import com.itextpdf.text.*;
import com.itextpdf.text.html.WebColors;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class GenerateUserDetailsPDF {

    private Document document;
    private Font headerFont;
    BaseColor myBackgroundColor;
    int count;

    public GenerateUserDetailsPDF() {
        myBackgroundColor = WebColors.getRGBColor("#F5D6D0");

        document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("EmployeeInformation.pdf"));
            document.open();
            addMetaData();
            document.add(new Paragraph(new Date().toString()));
            Anchor anchorTarget = new Anchor("User Information");
            anchorTarget.setName("BackToTop");
            Paragraph paragraph1 = new Paragraph();
            paragraph1.setFont(FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 255, 0, 0)));

            paragraph1.setSpacingBefore(50);
            paragraph1.add(anchorTarget);
            document.add(paragraph1);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        headerFont = FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD,
                new CMYKColor(0, 255, 255, 17));
    }

    private void addMetaData() {
        document.addTitle("My first PDF");
        document.addCreationDate();
        document.addSubject("Using iText");
        document.addKeywords("Java, PDF, iText");
        document.addAuthor("Ravneet Singh");
        document.addCreator("Ravneet Singh");

    }


    public void generateUserDetailsPDF(Employee e) {

//        for (int index = 0; index < SingletonClass.getInstance().arrayListEmployee.size(); index++) {
        float a;
            try {

                count++;
                PdfPTable t = new PdfPTable(2);
                t.setSpacingBefore(25);
                t.setSpacingAfter(25);

//              PdfPCell c1 = new PdfPCell(new Phrase("Id", headerFont))
//            t.addCell(c1);
//            t.addCell(String.valueOf(e.getName()));

                PdfPCell c1 = new PdfPCell(new Phrase("Name", headerFont));
//                c1.setBackgroundColor(myBackgroundColor);
                t.addCell(c1);
                t.addCell(String.valueOf(e.getName()));

                c1 = new PdfPCell(new Phrase("Year Of Birth", headerFont));
                t.addCell(c1);
                t.addCell(String.valueOf(e.getCalBirthYear()));


                if (e instanceof PartTime) {
                    PartTime p = (PartTime) e;

                    c1 = new PdfPCell(new Phrase("Rate", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(p.getRate()));

                    c1 = new PdfPCell(new Phrase("Hours Worked", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(p.getHoursWorked()));

                    if (p instanceof CommissionBasedPartTime) {
                        CommissionBasedPartTime c = (CommissionBasedPartTime) e;

                        c1 = new PdfPCell(new Phrase("Employee Type", headerFont));
                        t.addCell(c1);

                        c1 = new PdfPCell(new Phrase("PartTime / Commission ", headerFont));
                        t.addCell(c1);

                        c1 = new PdfPCell(new Phrase("Commission", headerFont));
                        t.addCell(c1);
                        t.addCell(String.valueOf(c.getCommissionPercentage()));

                        c1 = new PdfPCell(new Phrase("Earning", headerFont));
                        t.addCell(c1);
                        t.addCell(String.valueOf(c.calEarnings()));
                    } else if (p instanceof FixedBasedPartTime) {
                        FixedBasedPartTime f = (FixedBasedPartTime) e;

                        c1 = new PdfPCell(new Phrase("Employee Type", headerFont));
                        t.addCell(c1);

                        c1 = new PdfPCell(new Phrase("PartTime / Fixed ", headerFont));
                        t.addCell(c1);

                        c1 = new PdfPCell(new Phrase("Fixed Amount", headerFont));
                        t.addCell(c1);
                        t.addCell(String.valueOf(f.getFixedAmount()));

                        c1 = new PdfPCell(new Phrase("Earning", headerFont));
                        t.addCell(c1);
                        t.addCell(String.valueOf(f.calEarnings()));
                    }
                } else if (e instanceof Intern) {
                    Intern i = (Intern) e;

                    c1 = new PdfPCell(new Phrase("Employee Type", headerFont));
                    t.addCell(c1);

                    c1 = new PdfPCell(new Phrase("Intern ", headerFont));
                    t.addCell(c1);

                    c1 = new PdfPCell(new Phrase("School Name", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(i.getSchoolName()));

                    c1 = new PdfPCell(new Phrase("Earning", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(i.calEarnings()));
                } else if (e instanceof FullTime) {
                    FullTime ft = (FullTime) e;

                    c1 = new PdfPCell(new Phrase("Employee Type", headerFont));
                    t.addCell(c1);

                    c1 = new PdfPCell(new Phrase("Full Time ", headerFont));
                    t.addCell(c1);

                    c1 = new PdfPCell(new Phrase("Salary", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(ft.getSalary()));

                    c1 = new PdfPCell(new Phrase("Bonus", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(ft.getBonus()));

                    c1 = new PdfPCell(new Phrase("Earning", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(ft.calEarnings()));
                }
                if(e.getVehicle() == null)
                {
                    c1 = new PdfPCell(new Phrase("Vehicle Type", headerFont));
                    t.addCell(c1);

                    c1 = new PdfPCell(new Phrase("--- None ---", headerFont));
                    t.addCell(c1);
//                    t.addCell(String.valueOf("None"));

                }

                else if(e.getVehicle() instanceof Car)
                {
                    Car c = (Car) e.getVehicle();
                    c1 = new PdfPCell(new Phrase("Vehicle Type", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf("Car"));

                    c1 = new PdfPCell(new Phrase("Make", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(c.getCompany()));

                    c1 = new PdfPCell(new Phrase("Plate", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(c.getPlate()));

                    c1 = new PdfPCell(new Phrase("Colour", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(c.getColour()));

                    c1 = new PdfPCell(new Phrase("Plate", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(c.getYear()));

                    c1 = new PdfPCell(new Phrase("Storage Capacity", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(c.getStorageCapacity()));

                    c1 = new PdfPCell(new Phrase("Seat Count", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(c.getSeatCount()));
                }
                else if(e.getVehicle() instanceof Motorcycle)
                {
                    Motorcycle m = (Motorcycle) e.getVehicle();

                    c1 = new PdfPCell(new Phrase("Make", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(m.getCompany()));

                    c1 = new PdfPCell(new Phrase("Plate", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(m.getPlate()));

                    c1 = new PdfPCell(new Phrase("Colour", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(m.getColour()));

                    c1 = new PdfPCell(new Phrase("Plate", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(m.getYear()));

                    c1 = new PdfPCell(new Phrase("Storage Capacity", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(m.getEnginePower()));

                    c1 = new PdfPCell(new Phrase("Seat Count", headerFont));
                    t.addCell(c1);
                    t.addCell(String.valueOf(m.getTopSpeed()));
                }




                document.add(t);
            } catch (DocumentException ex) {
                ex.printStackTrace();
        }

    }
    public void setBackToTopLink(double totalPayroll) {
        try {
            Paragraph total = new Paragraph(new Phrase("Total Earning of all employees: " + totalPayroll ));
            document.add(total);
            Anchor anchor2 = new Anchor("Back To Top");
            anchor2.setReference("#BackToTop");
            document.add(anchor2);
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
