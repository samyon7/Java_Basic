class Planet_ADT{
	private String name;
	private double mass;
	
	public Planet_ADT(String name, double mass){
		this.name = name;
		this.mass = mass;
	}
	
	@Override
	public String toString(){
		return "Planet"+name+",mass:"+mass;
	}
}