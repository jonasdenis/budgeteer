package org.wickedsource.budgeteer.persistence.record;

import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wickedsource.budgeteer.persistence.RepositoryTestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecordRepositoryTest extends RepositoryTestTemplate {

    @Autowired
    private RecordRepository repository;

    @Test
    @DatabaseSetup("getSpentBudget.xml")
    @DatabaseTearDown(value = "getSpentBudget.xml", type = DatabaseOperation.DELETE_ALL)
    public void testGetSpentBudget() throws Exception {
        double value = repository.getSpentBudget(1l);
        Assert.assertEquals(170000d, value, 1d);
    }

    @Test
    @DatabaseSetup("getAverageDailyRate.xml")
    @DatabaseTearDown(value = "getAverageDailyRate.xml", type = DatabaseOperation.DELETE_ALL)
    public void testGetAverageDailyRate() throws Exception {
        double value = repository.getAverageDailyRate(1l);
        Assert.assertEquals(56666d, value, 1d);
    }

    @Test
     @DatabaseSetup("getPlannedBudget.xml")
     @DatabaseTearDown(value = "getPlannedBudget.xml", type = DatabaseOperation.DELETE_ALL)
     public void testGetPlannedBudget() throws Exception {
        double value = repository.getPlannedBudget(1l);
        Assert.assertEquals(170000d, value, 1d);
    }

    @Test
    @DatabaseSetup("getLastWorkRecordDate.xml")
    @DatabaseTearDown(value = "getLastWorkRecordDate.xml", type = DatabaseOperation.DELETE_ALL)
    public void testGetLatestWorkRecordDate() throws Exception {
        DateFormat format  = new SimpleDateFormat("yyyy-MM-dd");
        Date date = repository.getLatestWordRecordDate(1l);
        Assert.assertEquals(format.parse("2015-08-15"), date);
    }
}
