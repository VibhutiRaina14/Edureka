package Spring_Package.AOP_Project;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepositoryClass {
	public MovieRepositoryClass add(String name)
	{
		if(name==null)
		{
			throw new NullPointerException(name);
		}
		else
		{
			System.out.println("Movie added");
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
			System.out.println("Movie deleted");
		}
		return true;
		
	}

}
