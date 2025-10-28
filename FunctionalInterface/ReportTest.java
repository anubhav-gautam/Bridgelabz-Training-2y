package FunctionalInterface;

interface ReportExporter {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("Exporting report to JSON format...");
    }
}

class Report implements ReportExporter {
    public void exportToCSV() { System.out.println("Exported to CSV."); }
    public void exportToPDF() { System.out.println("Exported to PDF."); }
}

public class ReportTest {
    public static void main(String[] args) {
        Report r = new Report();
        r.exportToCSV();
        r.exportToPDF();
        r.exportToJSON();
    }
}