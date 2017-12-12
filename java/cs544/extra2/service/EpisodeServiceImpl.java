package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Episode;
@Service
public class EpisodeServiceImpl implements EpisodeService{

	@Autowired
	private EpisodeDAO episodeDAO;

	public void setEpisodeDAO(EpisodeDAO episodeDAO) {
		this.episodeDAO = episodeDAO;
	}
	
	@Override
	@Transactional
	public long save(Episode episode) {
		return this.episodeDAO.save(episode);
	}

	@Override
	@Transactional
	public void update(long id, Episode episode) {
		this.episodeDAO.update(id, episode);;
	}

	@Override
	@Transactional
	public List<Episode> list() {
		return this.episodeDAO.list();
	}

	@Override
	@Transactional
	public Episode get(long id) {
		return this.episodeDAO.get(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.episodeDAO.delete(id);
	}

}
