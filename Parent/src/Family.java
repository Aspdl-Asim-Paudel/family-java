class Family {
    private String familyName;
    private String houseAddress;

    public Family(String familyName, String houseAddress) {
        this.familyName = familyName;
        this.houseAddress = houseAddress;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }
}
