package searchable;

import java.io.Serializable;

public class Action implements Serializable
{
	
	private String action;

	
	public Action(){}
	public Action(String action) 
	{
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	@Override
	public boolean equals(Object obj)
	{
		Action a=(Action)obj;
		return action.equals(a.action);
	}
	
	@Override
	public int hashCode() {
		return action.hashCode();
	}
	
	
	

}
