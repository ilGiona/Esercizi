public class Stringa
{
	private char[] ivArray;
	
	public Stringa(String input)
	{
		if (input == null)
			throw new NullPointerException();
		ivArray=new char[input.length()];
		for(int i=0;i<ivArray.length;i++)
			ivArray[i]=input.charAt(i);
	}
	
	public char charAt(int index)
	{
		if (index < 0 || index >= ivArray.length)
			throw new StringIndexOutOfBoundsException();
		return ivArray[index];
	}
	
	public int compareTo(Stringa s)
	{
		if (s == null)
			throw new NullPointerException();
		for (int i = 0; i < ivArray.length && i < s.length(); i++)
			if (ivArray[i] != s.charAt(i))
				return ivArray[i] - s.charAt(i);
		if (ivArray.length != s.length())
			return ivArray.length - s.length();
		return 0;
	}
	
	public Stringa concat(Stringa s)
	{
		if (s == null)
			throw new NullPointerException();
		if (s.length() == 0)
			return this;
		Stringa unione=new Stringa("");
		unione.ivArray = new char[ivArray.length + s.length()];
		for (int i = 0; i < ivArray.length; i++)
			unione.ivArray[i] = ivArray[i];
		for (int i = 0; i < s.length(); i++)
			unione.ivArray[ivArray.length + i] = s.charAt(i);
		return unione;
	}
	public boolean endsWith(Stringa s)
	{
		if (s == null)
			throw new NullPointerException();
		if (ivArray.length < s.length())
			return false;
		for (int i = 0; i < s.length(); i++)
			if (ivArray[ivArray.length-1-i] != s.charAt(s.length()-1-i))
				return false;
			return true;
	}
	public int indexOf(Stringa s)
	{
		return indexOf(s,0);
	}
	public int indexOf(Stringa s, int fromIndex)
	{
		if (s == null)
			throw new NullPointerException();
		if (fromIndex < 0)
			fromIndex = 0;
		if (fromIndex > ivArray.length)
			fromIndex = ivArray.length;
		if (s.length() == 0)
			return fromIndex;
		/*for (int i=fromIndex;i<ivArray.length;i++)
			if (ivArray[i]==s.charAt(0))
				for (int j=i;j<s.length();j++)
				{
					if (ivArray[j]!=s.charAt(j))
						break;
					if (j++==s.length())
						return i;
				}
		return -1;*/
		for (int i = fromIndex; i < ivArray.length; i++)
			if (ivArray[i] == s.charAt(0))
			{ 
				int j = 1;
				while (j < s.length())
					if (ivArray[i+j] != s.charAt(j))
						break;
					else 
						j++;
				if (j == s.length())
					return i;
			}
		return -1;
	}
	public int lastIndexOf(Stringa s)
	{
		return lastIndexOf(s,ivArray.length);
	}
	public int lastIndexOf(Stringa s, int fromIndex)
	{
		if (s == null)
			throw new NullPointerException();
		if (fromIndex < 0)
			fromIndex = 0;
		if (fromIndex > ivArray.length)
			fromIndex = ivArray.length;
		if (s.length() == 0)
			return fromIndex;
		if (fromIndex == ivArray.length)
			fromIndex--;
		/*for (int i=fromIndex;i>=0;i--)
			if (ivArray[i]==s.charAt(0))
				for (int j=i;j<s.length();j++)
				{
					if (ivArray[j]!=s.charAt(j))
						break;
					if (j++==s.length())
						return i;
				}
		return -1;*/
		for (int i = fromIndex; i >= 0; i--)
			if (ivArray[i] == s.charAt(0))
			{ 
				int j = 1;
				while (j < s.length())
				if (ivArray[i+j] != s.charAt(j))
					break;
				else
					j++;
				if (j == s.length())
				return i;
			}
		return -1;
	}
	public int length()
	{
		return ivArray.length;
	}
	public Stringa substring(int beginIndex)
	{
		return substring(beginIndex,ivArray.length);
	}
	public Stringa substring(int beginIndex, int endIndex)
	{
		if (beginIndex < 0 || endIndex > ivArray.length || beginIndex > endIndex)
			throw new StringIndexOutOfBoundsException();
		Stringa sottostringa=new Stringa("");
		sottostringa.ivArray=new char[endIndex-beginIndex];
		for (int i=0;i<endIndex-beginIndex;i++)
			sottostringa.ivArray[i]=ivArray[beginIndex+i];
		return sottostringa;
	}
}