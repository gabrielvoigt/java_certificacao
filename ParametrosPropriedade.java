class ParametroPropriedade{
	
	static String key = System.getProperty("key");

	static public void main(String[] args){
		
		if(args.length > 0){
			for(String arg : args){
				System.out.println("args" + arg);
			}
		}

		System.out.println("Key:" + key);
	}
}
