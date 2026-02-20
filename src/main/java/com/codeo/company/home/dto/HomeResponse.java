



package com.codeo.company.home.dto;

public class HomeResponse {

    private String companyName;
    private String tagline;
    private String about;

    private int years;
    private int employees;
    private int clients;

    // CEO
    private String ceoName;
    private String ceoMessage;
    private String ceoPhotoUrl;
    private String ceoPortfolioUrl;

    // MD
    private String mdName;
    private String mdMessage;
    private String mdPhotoUrl;
    private String mdPortfolioUrl;

    // getters & setters
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getTagline() { return tagline; }
    public void setTagline(String tagline) { this.tagline = tagline; }

    public String getAbout() { return about; }
    public void setAbout(String about) { this.about = about; }

    public int getYears() { return years; }
    public void setYears(int years) { this.years = years; }

    public int getEmployees() { return employees; }
    public void setEmployees(int employees) { this.employees = employees; }

    public int getClients() { return clients; }
    public void setClients(int clients) { this.clients = clients; }

    public String getCeoName() { return ceoName; }
    public void setCeoName(String ceoName) { this.ceoName = ceoName; }

    public String getCeoMessage() { return ceoMessage; }
    public void setCeoMessage(String ceoMessage) { this.ceoMessage = ceoMessage; }

    public String getCeoPhotoUrl() { return ceoPhotoUrl; }
    public void setCeoPhotoUrl(String ceoPhotoUrl) { this.ceoPhotoUrl = ceoPhotoUrl; }

    public String getCeoPortfolioUrl() { return ceoPortfolioUrl; }
    public void setCeoPortfolioUrl(String ceoPortfolioUrl) { this.ceoPortfolioUrl = ceoPortfolioUrl; }

    public String getMdName() { return mdName; }
    public void setMdName(String mdName) { this.mdName = mdName; }

    public String getMdMessage() { return mdMessage; }
    public void setMdMessage(String mdMessage) { this.mdMessage = mdMessage; }

    public String getMdPhotoUrl() { return mdPhotoUrl; }
    public void setMdPhotoUrl(String mdPhotoUrl) { this.mdPhotoUrl = mdPhotoUrl; }

    public String getMdPortfolioUrl() { return mdPortfolioUrl; }
    public void setMdPortfolioUrl(String mdPortfolioUrl) { this.mdPortfolioUrl = mdPortfolioUrl; }
}