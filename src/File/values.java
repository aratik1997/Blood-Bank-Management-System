package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class values
{
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private String phone;
	@SuppressWarnings("unused")
	private String email;
	@SuppressWarnings("unused")
	private String blood_group;
	values()
	{
		this.name = null;
		this.phone = null;
		this.email = null;
		this.blood_group = null;
	}
	public String getName() 
	{
		return fread(0);
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPhone() 
	{
		return fread(1);
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	public String getEmail() 
	{
		return fread(2);
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getBlood_group() 
	{
		return fread(3);
	}
	public void setBlood_group(String blood_group) 
	{
		this.blood_group = blood_group;
	}
	public String fread(int num)
	{
		try (BufferedReader BR = new BufferedReader(new FileReader("login.txt"))) 
		{
			String s;
			String[] sr = null;
			
			while((s=BR.readLine()) != null)
			{
				sr=s.split(",");
				name=sr[0];
				phone=sr[1];
				email=sr[2];
				blood_group=sr[3];
			}
			return sr[num];
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return null;
	}

}
