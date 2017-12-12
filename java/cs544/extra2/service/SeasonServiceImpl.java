package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Season;
@Service
public class SeasonServiceImpl implements SeasonService{
	@Autowired
	private SeasonDAO seasonDAO;

	public void setSeasonDAO(SeasonDAO seasonDAO) {
		this.seasonDAO = seasonDAO;
	}
	
	@Override
	@Transactional
	public long save(Season season) {
		return this.seasonDAO.save(season);
	}

	@Override
	@Transactional
	public void update(long id, Season season) {
		this.seasonDAO.update(id, season);;
	}

	@Override
	@Transactional
	public List<Season> list() {
		return this.seasonDAO.list();
	}

	@Override
	@Transactional
	public Season get(long id) {
		return this.seasonDAO.get(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.seasonDAO.delete(id);
	}
}
