
public class Customer implements CustomerInterface {
	private String name;

	/* (non-Javadoc)
	 * @see CustomerInterface#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	public Customer(String name) {
		this.name = name;
	}
	
		/* (non-Javadoc)
		 * @see CustomerInterface#toString()
		 */
		@Override
		public String toString() {
		return name;
	}
	
	public Customer(Customer copyCust) {
		this.name = copyCust.name;
	}
}
