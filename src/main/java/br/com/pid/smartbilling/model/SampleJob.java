package br.com.pid.smartbilling.model;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.pid.smartbilling.service.SampleService;

public class SampleJob implements Job {
    @Autowired
    private SampleService service;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        service.listarDadosPerfilConsumo();
    }
}