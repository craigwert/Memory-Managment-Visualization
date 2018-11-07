//This class represents a process object that will contain
//a size and time to live.

public class process
{
	private const String name;
	private int size;
	private int ttl;

	//Constructor for class process.
	//@param name: name of the process
	//@param size: size of the process
	//@param ttl: time to live of the process
	public process(String name, int size, int ttl)
	{
		this.name = name;
		this.size = size;
		this.ttl = ttl;
	}

	//Accessor for name.
	//@return name
	public String getName()
	{
		return name;
	}

	//Mutator for size field.
	//@param size sets the size.
	public void setSize(int size)
	{
		this.size = size;
	}

	//Accessor for size.
	//@return size the size of the process.
	public int getSize()
	{
		return size;
	}


	//Mutator for ttl field.
	//@param ttl sets the ttl.
	public void setTTL(int ttl)
	{
		this.ttl = ttl;
	}

	//Accessor for ttl.
	//@return ttl the ttl of the process.
	public int getTTL()
	{
		return ttl;
	}
}