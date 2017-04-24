package es.unir.web.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;

import es.unir.web.dto.UsuarioDTO;

public class UsuarioDAO implements Serializable {

	private static final long serialVersionUID = 603531139172302760L;

	private final Logger log = Logger.getLogger(UsuarioDAO.class);

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(final SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public UsuarioDTO guardarUsuario(UsuarioDTO usuario) {
		return hibernateTemplate.merge(usuario);
	}

	public UsuarioDTO getUsuario(Long id) {
		return hibernateTemplate.get(UsuarioDTO.class, id);
	}

	public UsuarioDTO existeUsuario(String usuario) {
		DetachedCriteria criteria = DetachedCriteria.forClass(UsuarioDTO.class);
		criteria.add(Restrictions.eq("usuario", usuario));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List findByCriteria = hibernateTemplate.findByCriteria(criteria);
		if (findByCriteria != null && !findByCriteria.isEmpty()) {
			return (UsuarioDTO) findByCriteria.get(0);
		}
		return null;
	}

	public UsuarioDTO obtenerUsuario(String usuario, String clave) {
		DetachedCriteria criteria = DetachedCriteria.forClass(UsuarioDTO.class);
		criteria.add(Restrictions.eq("usuario", usuario));
		criteria.add(Restrictions.eq("clave", clave));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List findByCriteria = hibernateTemplate.findByCriteria(criteria);
		if (findByCriteria != null && !findByCriteria.isEmpty()) {
			return (UsuarioDTO) findByCriteria.get(0);
		}
		return null;
	}

	public List listaUsuarios() {
		DetachedCriteria criteria = DetachedCriteria.forClass(UsuarioDTO.class);
		criteria.addOrder(Order.desc("nombre"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return hibernateTemplate.findByCriteria(criteria);
	}

}
