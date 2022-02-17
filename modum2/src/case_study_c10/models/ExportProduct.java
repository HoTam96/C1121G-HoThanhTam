package case_study_c10.models;

public class ExportProduct extends Product {
    private double priceExport;
    private String exportCountryName;

    public ExportProduct(int id, String productCode, String productName, double price,
                         int amount, String producer, double priceExport, String exportCountryName) {
        super(id, productCode, productName, price, amount, producer);
        this.priceExport = priceExport;
        this.exportCountryName = exportCountryName;
    }

    public ExportProduct(double priceExport, String exportCountryName) {
        this.priceExport = priceExport;
        this.exportCountryName = exportCountryName;
    }

    public double getPriceExport() {
        return priceExport;
    }

    public void setPriceExport(double priceExport) {
        this.priceExport = priceExport;
    }

    public String getExportCountryName() {
        return exportCountryName;
    }

    public void setExportCountryName(String exportCountryName) {
        this.exportCountryName = exportCountryName;
    }


    @Override
    public String toString() {
        return "ExportProduct{" +
                super.toString() +
                "priceExport=" + priceExport +
                ", exportCountryName='" + exportCountryName + '\'' +
                '}';
    }

    @Override
    public String getInForProduct() {
        return super.getInForProduct() + "," + this.priceExport + "," + this.exportCountryName;
    }
}
