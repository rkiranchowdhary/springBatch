package processor;

import domain.CustomerCredit;
import org.springframework.batch.item.ItemProcessor;


public class CustomProcessor<T> implements ItemProcessor<T,T>{

	
    public T process(T item) throws Exception {
//        if(((CustomerCredit)item).getName().equals("redbull")){
//          throw new Exception("Redbull not allowed");
//        }
        return item;
    }
}
