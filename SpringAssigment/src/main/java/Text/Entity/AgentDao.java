package Text.Entity;

import org.springframework.jdbc.core.JdbcTemplate;

public class AgentDao {
//	create object of JdbcTemplate
	private JdbcTemplate jdbcTemplate;
//Jdbc Template
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	//Save Method of Agent Table
	public int saveAgent(Agent a) 
	{
		String query="insert into Agent values('"+a.getId()+"','"+a.getName()+"','"+a.getComission()+"')";
		
		return jdbcTemplate.update(query);
	}
	//Update Method Of Agent Table
	public int updateAgent(Agent a)
	{
		String query1="update Agent set name='"+a.getName()+"',comission='"+a.getComission()+"' where id ='"+a.getId()+"'";
		return jdbcTemplate.update(query1);
		
	}
	//Delete Methd of agent Table
	public int deleteAgent(Agent a)
	{
		String query2="delete from Agent where id='"+a.getId()+"'";
		return jdbcTemplate.update(query2);
	}
	}



