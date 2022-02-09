package resources;

public enum ApiEnum {
	
	
	getIntigralAPI("/popcorn-api-rs-7.9.17/v1/promotions");
	private String resource;

	ApiEnum(String resource) {
		this.resource = resource;
		// TODO Auto-generated constructor stub
	}
	
	public String getResource() {
		return resource;		
	}
	

}
