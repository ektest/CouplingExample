/**
 * A Very basic demonstration of what a container does.
 */
public class CrudeContainer 
{
	// VERY CRUDE!!
	public static InvoiceService getInvoiceService()
	{
		// set up the Data Access Object
		InvoicingDAO dao = new HibernateDAO();
		
		// create the service
		InvoiceService service = new InvoiceService();
		
		// configure it
		service.setDao(dao);
		
		return service;
	}
}
