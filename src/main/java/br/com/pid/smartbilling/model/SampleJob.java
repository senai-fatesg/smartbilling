package br.com.pid.smartbilling.model;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.pid.smartbilling.service.SampleService;

/**
 * Created by david on 2015-01-20.
 */
public class SampleJob implements Job {
    @Autowired
    private SampleService service;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        service.hello();
    }
}