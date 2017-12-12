package cs544.extra2.dao;

import java.util.List;

import cs544.extra2.model.TVSeries;

public interface TVSeriesDAO {
	  public long save(TVSeries tVSeries);
	  public TVSeries get(long id);
	  public List<TVSeries> list();
	  public void update(long id, TVSeries tVSeries);
	  public void delete(long id);
}
