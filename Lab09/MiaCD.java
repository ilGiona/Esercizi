public class MiaCD implements CD
{
	private Object[] cd=new Object[1];
	private int first, last, dim;
	public int size()
	{return dim;}
	public boolean isEmpty()
	{return dim==0;}
	public void addFirst (Object x)
	{
		if (dim==cd.length)
			resize();
		if (dim==0)
		{
			cd[0]=x;
			first=cd.length-1;
			last=1;
		}
		else
		{
			cd[first]=x;
			first--;
			if (first==-1)
				first=cd.length-1;
		}
		dim++;
	}
	public void addLast (Object x)
	{
		if (dim==cd.length)
			resize();
		if (dim==0)
		{
			cd[0]=x;
			first=cd.length-1;
			last=1;
		}
		else
		{
			cd[last]=x;
			last++;
			if (last==cd.length)
				last=0;
		}
		dim++;
	}
	public Object removeFirst () throws EmptyCDException
	{
		if (isEmpty())
			throw new EmptyCDException();
		first++;
		dim--;
		if (first==cd.length)
			first=0;
		return cd[first];
	}
	public Object removeLast () throws EmptyCDException
	{
		if (isEmpty())
			throw new EmptyCDException();
		last--;
		dim--;
		if (last==-1)
			last=cd.length;
		return cd[last];
	}
	public Object getFirst () throws EmptyCDException
	{
		if (isEmpty())
			throw new EmptyCDException();
		int i=first++;
		if (i==cd.length)
			i=0;
		return cd[i];
	}
	public Object getLast ()  throws EmptyCDException
	{
		if (isEmpty())
			throw new EmptyCDException();
		int i=last--;
		if (i==-1)
			i=cd.length-1;
		return cd[i];
	}
	private void resize()
	{
		Object[] newcd=new Object[2*cd.length];
		for (int i=0;i<dim;i++)
		{
			first++;
			if (first==cd.length)
				first=0;
			newcd[i]=cd[first];
		}
		first=newcd.length-1;
		last=dim;
		cd=newcd;
	}
}