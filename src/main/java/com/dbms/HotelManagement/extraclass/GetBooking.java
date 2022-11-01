package com.dbms.HotelManagement.extraclass;

import com.dbms.HotelManagement.model.Member;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GetBooking {
    private String checkInDate;
    private String checkOutDate;
    private int countMember;
    private int singleRoom;
    private int doubleRoom;
    private List<Member> membersList;

    public GetBooking() {
    }
    public GetBooking(String checkInDate, String checkOutDate, int countMember, int singleRoom, int doubleRoom, List<Member> membersList) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.countMember = countMember;
        this.singleRoom = singleRoom;
        this.doubleRoom = doubleRoom;
        this.membersList = membersList;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getCountMember() {
        return countMember;
    }

    public void setCountMember(int countMember) {
        this.countMember = countMember;
    }

    public int getSingleRoom() {
        return singleRoom;
    }

    public void setSingleRoom(int singleRoom) {
        this.singleRoom = singleRoom;
    }

    public int getDoubleRoom() {
        return doubleRoom;
    }

    public void setDoubleRoom(int doubleRoom) {
        this.doubleRoom = doubleRoom;
    }

    public List<Member> getMembersList() {
        return membersList;
    }

    public void setMembersList(List<Member> membersList) {
        this.membersList = membersList;
    }
}
