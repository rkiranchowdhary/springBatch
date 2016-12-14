package listeners;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public class JobListener {

    private static final Log logger = LogFactory.getLog(JobListener.class);

    @AfterJob
    public void afterJob(JobExecution jobExecution){
       logger.info(String.format(" Job BEFORE executed %s", jobExecution.getExitStatus().getExitCode()));
    }

    @BeforeJob
    public void beforeJob(JobExecution jobExecution){
        logger.info(String.format(" Job AFTER executed %s", jobExecution.getExitStatus().getExitCode()));
    }
}
