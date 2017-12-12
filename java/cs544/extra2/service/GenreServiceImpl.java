package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Genre;
@Service
public class GenreServiceImpl implements GenreService {

	@Autowired
	private GenreDAO genreDAO;

	public void setGenreDAO(GenreDAO genreDAO) {
		this.genreDAO = genreDAO;
	}
	
	@Override
	@Transactional
	public long save(Genre genre) {
		return this.genreDAO.save(genre);
	}

	@Override
	@Transactional
	public void update(long id, Genre genre) {
		this.genreDAO.update(id, genre);;
	}

	@Override
	@Transactional
	public List<Genre> list() {
		return this.genreDAO.list();
	}

	@Override
	@Transactional
	public Genre get(long id) {
		return this.genreDAO.get(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.genreDAO.delete(id);
	}

}
