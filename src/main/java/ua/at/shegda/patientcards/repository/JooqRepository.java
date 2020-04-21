package ua.at.shegda.patientcards.repository;

import org.jooq.UpdatableRecord;
import java.util.List;

public interface JooqRepository 
	<T extends UpdatableRecord, R, P> {

	    /**
	     * Find all list.
	     *
	     * @return
	     */
	    List<T> findAll();

	    /**
	     * Find one entity by id.
	     *
	     * @param id
	     * @return
	     */
	    T findOne(P id);

	    /**
	     * Save entity.
	     *
	     * @param entity
	     * @return
	     */
	    T save(R entity);

	    /**
	     * Update entity.
	     *
	     * @param entity
	     * @return
	     */
	    T update(R entity);

	    /**
	     * Delete entity.
	     *
	     * @param id
	     */
	    void delete(P id);

	    /**
	     * Check if entity exist.
	     *
	     * @param id
	     * @return
	     */
	    boolean exist(P id);
}
