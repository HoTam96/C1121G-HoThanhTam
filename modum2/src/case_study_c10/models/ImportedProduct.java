package case_study_c10.models;

public class ImportedProduct extends Product {
    private double priceImport;
    private String provinceImport;
    private  double tax;

    public ImportedProduct(int id, String productCode, String productName, double price, int amount, String producer,
                           double priceImport, String provinceImport, double tax) {
        super(id, productCode, productName, price, amount, producer);
        this.priceImport = priceImport;
        this.provinceImport = provinceImport;
        this.tax = tax;
    }

    public ImportedProduct(double priceImport, String provinceImport, double tax) {
        this.priceImport = priceImport;
        this.provinceImport = provinceImport;
        this.tax = tax;
    }

    public ImportedProduct() {
    }

    public double getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(double priceImport) {
        this.priceImport = priceImport;
    }

    public String getProvinceImport() {
        return provinceImport;
    }

    public void setProvinceImport(String provinceImport) {
        this.provinceImport = provinceImport;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "ImportedProduct{" +
                super.toString()+
                "priceImport=" + priceImport +
                ", provinceImport='" + provinceImport + '\'' +
                ", tax=" + tax +
                '}';
    }

    @Override
    public String getInForProduct() {
        return super.getInForProduct()+","+priceImport+","+provinceImport+","+tax;
    }
}
