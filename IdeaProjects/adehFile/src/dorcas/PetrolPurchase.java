package dorcas;

public class PetrolPurchase {

    private String stationLocation;
    private String petrolType;
    private int quantityPurchase;
    private double pricePerLitre;
    private double percentageDiscount;

    private double purchaseAmount;

    public PetrolPurchase(String stationLocation, String petrolType, int quantityPurchase, double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantityPurchase = quantityPurchase;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public void setQuantityPurchase(int quantityPurchase) {
        this.quantityPurchase = quantityPurchase;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getQuantityPurchase() {
        return quantityPurchase;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchaseAmount() {
        double netPurchaseAmount = quantityPurchase * pricePerLitre;

        purchaseAmount = netPurchaseAmount - percentageDiscount;
        return purchaseAmount;
    }
}


