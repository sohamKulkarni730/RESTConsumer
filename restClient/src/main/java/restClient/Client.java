package restClient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;



public class Client {

	public static void main(String[] args) throws Exception
	{
	  try 
	  {
		    RestTemplate nClient = new RestTemplate() ; 
		    
			ObjectMapper mapper =new ObjectMapper();
			
			ResponceSchema driverList=  mapper.readValue(nClient.getForObject("https://pegasus.greyhound.com/busTracker/dispatch/driverBusAssignment", String.class), ResponceSchema.class);
			
			
			
			String file = "C:\\Users\\AMOD\\Desktop\\ObjectList.txt";
			
			PrintWriter OutputWriter = new PrintWriter(file);
			
			//################################  OBJECT WRITER
			
			//FileOutputStream fileWriter =new FileOutputStream(file) ;
			
			//ObjectOutputStream ObjectWriter = new ObjectOutputStream(fileWriter);
			
			//ObjectWriter.writeObject(driverList.getResults());
			
			//ObjectWriter.close();
			
			
			for (DriverInfo d : driverList.getResults()) {
				
				OutputWriter.print(d.getOper_nbr()+" "+d.getCarrier_cd()+" "+d.getFirst_name()+" "+
									d.getLast_name()+" "+d.getMiddle_init()+" "+d.getHome_loc_6()+" "+
									d.getHome_loc_3()+" "+d.getOper_class()+"\n");
				
			}
			
			OutputWriter.close();
			
			
	  }	
	  catch (Exception e)
	  {
		  System.out.println(e);
	  }
		
		
		
	}

}
