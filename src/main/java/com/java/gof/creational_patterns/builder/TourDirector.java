package com.java.gof.creational_patterns.builder;

import java.time.LocalDate;

public class TourDirector {

    private final TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cacncunTrip() {
        return tourPlanBuilder.title("칸쿤여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 06, 30))
                .whereToStay("시애틀")
                .addPlan(0, "체크인")
                .addPlan(0, "저녁먹기")
                .addPlan(1, "아침먹기")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2022, 06, 30))
                .getPlan();
    }
}
