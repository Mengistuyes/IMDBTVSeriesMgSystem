package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.TVSeries;
@Service
public class TVSeriesServiceImpl implements TVSeriesService {

	@Autowired
	private TVSeriesDAO TVSeriesDAO;

	public void setTVSeriesDAO(TVSeriesDAO TVSeriesDAO) {
		this.TVSeriesDAO = TVSeriesDAO;
	}
	
	@Override
	@Transactional
	public long save(TVSeries TVSeries) {
		return this.TVSeriesDAO.save(TVSeries);
	}

	@Override
	@Transactional
	public void update(long id, TVSeries TVSeries) {
		this.TVSeriesDAO.update(id, TVSeries);;
	}

	@Override
	@Transactional
	public List<TVSeries> list() {
		return this.TVSeriesDAO.list();
	}

	@Override
	@Transactional
	public TVSeries get(long id) {
		return this.TVSeriesDAO.get(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.TVSeriesDAO.delete(id);
	}

}
