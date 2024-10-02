package br.com.fiap.handsonspringbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfiguration {
    public Job processarPerson(){
        return null;
    }

    public Step step(){
        return null;
    }

    public ItemReader<Person> itemReader(){
        return null;
    }

    public ItemWriter<Person> itemWriter(){
        return null;
    }


}
