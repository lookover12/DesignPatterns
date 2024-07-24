package com.pd.multition;

public class LeaderMain {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Staff staff = new Staff();
            staff.dealWork("处理" + i);
        }
    }
}
