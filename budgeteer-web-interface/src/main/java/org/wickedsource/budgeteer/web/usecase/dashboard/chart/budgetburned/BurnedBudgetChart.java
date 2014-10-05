package org.wickedsource.budgeteer.web.usecase.dashboard.chart.budgetburned;

import com.googlecode.wickedcharts.highcharts.theme.Theme;
import com.googlecode.wickedcharts.wicket6.highcharts.Chart;

public class BurnedBudgetChart extends Chart {

    public BurnedBudgetChart(String id, BurnedBudgetChartModel model, Theme theme) {
        super(id, new BurnedBudgetChartOptions(model), theme);
    }

}
