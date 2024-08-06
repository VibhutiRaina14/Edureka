package Spring_Package.AOP_Project;

import org.springframework.stereotype.Repository;

@Repository
public class ActorRepositoryClass {
	public ActorRepositoryClass add(String name)
	{
		if(name==null)
		{
			throw new NullPointerException(name);
		}
		else
		{
			System.out.println("Actor added");
		}
		return this;
		
	}
	public boolean delete(String name)
	{
		if(name==null)
		{
			throw new NullPointerException(name);
		}
		else
		{
			System.out.println("Actor deleted");
		}
		return true;
		
	}
	

}
