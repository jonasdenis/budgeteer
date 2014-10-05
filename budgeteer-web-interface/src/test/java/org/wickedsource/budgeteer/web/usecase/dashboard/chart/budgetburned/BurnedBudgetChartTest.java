package org.wickedsource.budgeteer.web.usecase.dashboard.chart.budgetburned;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;
import org.wickedsource.budgeteer.web.AbstractWebTestTemplate;
import org.wickedsource.budgeteer.web.wickedcharts.BudgeteerChartTheme;

public class BurnedBudgetChartTest extends AbstractWebTestTemplate {

    @Test
    public void testRender() {
        WicketTester tester = getTester();
        BurnedBudgetChartModel model = new BurnedBudgetChartModel(1l, 5);
        tester.startComponentInPage(new BurnedBudgetChart("chart", model, new BudgeteerChartTheme()));
    }

}
