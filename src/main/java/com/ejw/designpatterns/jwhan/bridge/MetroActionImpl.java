package com.ejw.designpatterns.jwhan.bridge;

public class MetroActionImpl implements MetroAction {

    private final String company;

    public MetroActionImpl(String company) {
        this.company = company;
    }

    @Override
    public String move() {
        return company + " Move";
    }

    @Override
    public String doorOpen() {
        return company + " DoorOpen ";
    }

    @Override
    public String doorClose() {
        return company + " DoorClose";
    }

    public String action() {
        StringBuilder sb = new StringBuilder();
        sb.append(company + "Station Start ");
        sb.append(move());
        sb.append(company +  "Station Arrive");
        sb.append(doorOpen());
        sb.append(doorClose());

        return String.valueOf(sb);
    }
}
