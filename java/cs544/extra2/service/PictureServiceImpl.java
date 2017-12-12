package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Picture;
@Service
public class PictureServiceImpl implements PictureService {

	@Autowired
	private PictureDAO pictureDAO;

	public void setPictureDAO(PictureDAO pictureDAO) {
		this.pictureDAO = pictureDAO;
	}
	
	@Override
	@Transactional
	public long save(Picture picture) {
		return this.pictureDAO.save(picture);
	}

	@Override
	@Transactional
	public void update(long id, Picture picture) {
		this.pictureDAO.update(id, picture);;
	}

	@Override
	@Transactional
	public List<Picture> list() {
		return this.pictureDAO.list();
	}

	@Override
	@Transactional
	public Picture get(long id) {
		return this.pictureDAO.get(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.pictureDAO.delete(id);
	}

}
